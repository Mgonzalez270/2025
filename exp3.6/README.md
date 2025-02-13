## Pseudocode

BEGIN
  // Get input from the user
  DISPLAY "Enter weight in pounds: "
  GET weight

  DISPLAY "Enter feet: "
  GET feet

  DISPLAY "Enter inches: "
  GET inches

  // Calculate height in meters
  heightInInches = (feet * 12) + inches
  heightInMeters = heightInInches * 0.0254

  // Calculate BMI
  bmi = weight * 0.45359237 / (heightInMeters * heightInMeters)

  // Display BMI
  DISPLAY "BMI is " + bmi

  // Interpret BMI and display the result
  IF bmi < 18.5 THEN
    DISPLAY "Underweight"
  ELSE IF bmi < 25 THEN
    DISPLAY "Normal"
  ELSE IF bmi < 30 THEN
    DISPLAY "Overweight"
  ELSE
    DISPLAY "Obese"
  ENDIF

  // Close input (optional, but good practice)
  CLOSE input 

END