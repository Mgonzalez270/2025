## Pseudocode

BEGIN

FUNCTION displaySortedNumbers(num1, num2, num3)
    DECLARE temp

    // Compare and swap if needed to sort the numbers
    IF num1 > num2 THEN
        temp ← num1
        num1 ← num2
        num2 ← temp
    END IF

    IF num2 > num3 THEN
        temp ← num2
        num2 ← num3
        num3 ← temp
    END IF

    IF num1 > num2 THEN
        temp ← num1
        num1 ← num2
        num2 ← temp
    END IF

    DISPLAY "The numbers in increasing order are: ", num1, ", ", num2, ", ", num3
END FUNCTION

MAIN PROGRAM
    PROMPT "Enter the first number: "
    READ num1

    PROMPT "Enter the second number: "
    READ num2

    PROMPT "Enter the third number: "
    READ num3

    CALL displaySortedNumbers(num1, num2, num3)

END
