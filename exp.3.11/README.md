## Pseudocode

START

  // Create a scanner object to read input from the user
  PROMPT "Enter the month (1-12): "
  READ month

  PROMPT "Enter the year: "
  READ year

  // Validate month input
  IF month < 1 OR month > 12 THEN
      DISPLAY "Invalid month."
  ELSE
      // Define an array with the number of days in each month (February will be handled later)
      daysInMonths = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

      // Check if the given year is a leap year
      IF month == 2 AND (year is divisible by 4 AND (year is not divisible by 100 OR year is divisible by 400)) THEN
          // If leap year, update February days to 29
          daysInMonths[1] = 29
      END IF

      // Output the result
      DISPLAY "Month " + month + " of year " + year + " has " + daysInMonths[month - 1] + " days."
  END IF

END