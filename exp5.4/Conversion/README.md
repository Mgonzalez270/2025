## Pseudocode

START

  // Define a constant for the conversion factor
  SET kilometers_per_mile = 1.609

  // Display the table header
  DISPLAY "Miles   Kilometers"
  DISPLAY "--------------------"

  // Loop through miles from 1 to 10
  FOR miles FROM 1 TO 10
    // Calculate kilometers
    SET kilometers = miles * kilometers_per_mile

    // Display the miles and kilometers, formatted
    DISPLAY miles, "   ", kilometers (formatted to 3 decimal places, left-aligned)
  END FOR

END
