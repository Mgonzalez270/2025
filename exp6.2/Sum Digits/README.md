BEGIN

FUNCTION sumDigits(n)
    SET sum TO 0
    SET n TO absolute value of n

    WHILE n is not equal to 0
        ADD (n mod 10) to sum       // Get last digit
        SET n TO n divided by 10    // Remove last digit
    END WHILE

    RETURN sum
END FUNCTION

MAIN PROGRAM
    CREATE scanner for user input
    DECLARE choice AS character

    DO
        DISPLAY "Enter an integer: "
        READ number from user

        CALL sumDigits(number) and store result in result
        DISPLAY "The sum of the digits is: " + result

        DISPLAY "Would you like to enter another number? (y/n): "
        READ choice from user
        CONVERT choice to lowercase

    WHILE choice is equal to 'y'

    DISPLAY "Thanks for using the program!"
    CLOSE scanner
END MAIN

END
