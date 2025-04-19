## Pseudocode

// Method to calculate the average of an integer array
FUNCTION average(integer array):
  IF array is NULL OR length of array is 0 THEN
    RETURN 0
  ENDIF
  SET sum TO 0
  FOR EACH number IN array:
    SET sum TO sum + number
  ENDFOR
  RETURN sum / length of array

// Method to calculate the average of a double array
FUNCTION average(double array):
  IF array is NULL OR length of array is 0 THEN
    RETURN 0.0
  ENDIF
  SET sum TO 0.0
  FOR EACH number IN array:
    SET sum TO sum + number
  ENDFOR
  RETURN sum / length of array

// Main program
FUNCTION main():
  CREATE input AS a Scanner object
  CREATE numbers AS a double array of size 10

  PRINT "Enter ten double values:"
  FOR i FROM 0 TO 9 (inclusive):
    PRINT "Value " + (i + 1) + ": "
    READ numbers[i] FROM input
  ENDFOR

  SET avg TO average(numbers)
  PRINT "The average value is: " + avg

  CLOSE input