## Pseudocode

START

  // Create a way to get input from the user
  CREATE input_scanner
  DECLARE continue_choice

  DO
    // Display a message asking the user for input
    DISPLAY "Enter a letter: "

    // Read the input as a string
    READ letter_string

    // Check if the input string has exactly one character
    IF LENGTH of letter_string is NOT 1 THEN
      DISPLAY letter_string, " is an invalid input"
    ELSE
      // Convert the first character to lowercase
      SET letter = lowercase of the first character of letter_string

      // Check if the character is a letter
      IF letter is a letter THEN
        // Check if the letter is a vowel
        IF letter is 'a' OR letter is 'e' OR letter is 'i' OR letter is 'o' OR letter is 'u' THEN
          DISPLAY letter_string, " is a vowel"
        ELSE
          DISPLAY letter_string, " is a consonant"
        END IF
      ELSE
        DISPLAY letter_string, " is an invalid input"
      END IF
    END IF

    // Ask the user if they want to continue
    DISPLAY "Do you want to check another letter? (yes/no): "
    READ continue_choice

    // Convert the user's choice to lowercase for easier comparison
    SET continue_choice = lowercase of continue_choice

  WHILE continue_choice is equal to "yes"

  // Display a goodbye message
  DISPLAY "Goodbye!"

  // Clean up the input mechanism
  CLOSE input_scanner

END

// Helper function to check if a character is a vowel (optional in pseudocode, but reflects the Java code)
FUNCTION isVowel(character)
  IF character is 'a' OR character is 'e' OR character is 'i' OR character is 'o' OR character is 'u' THEN
    RETURN true
  ELSE
    RETURN false
  END IF
END FUNCTION