## Pseudocode
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