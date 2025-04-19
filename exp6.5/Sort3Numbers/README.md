## Pseudocode

// Method to display three numbers in increasing order
METHOD displaySortedNumbers(num1, num2, num3)
  DECLARE min, mid, max AS DOUBLE

  // Find the minimum
  IF num1 <= num2 AND num1 <= num3 THEN
    min = num1
    IF num2 <= num3 THEN
      mid = num2
      max = num3
    ELSE
      mid = num3
      max = num2
    END IF
  ELSE IF num2 <= num1 AND num2 <= num3 THEN
    min = num2
    IF num1 <= num3 THEN
      mid = num1
      max = num3
    ELSE
      mid = num3
      max = num1
    END IF
  ELSE
    min = num3
    IF num1 <= num2 THEN
      mid = num1
      max = num2
    ELSE
      mid = num2
      max = num1
    END IF
  END IF

  // Display the sorted numbers
  DISPLAY min, " ", mid, " ", max
END METHOD

// Main program
START
  // Create a scanner for user input
  CREATE scanner

  // Prompt the user for three numbers
  DISPLAY "Enter three numbers: "
  INPUT num1
  INPUT num2
  INPUT num3

  // Call the method to display the sorted numbers
  CALL displaySortedNumbers(num1, num2, num3)

  // Close the scanner
  CLOSE scanner
END