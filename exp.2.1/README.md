## Pseudocode

BEGIN

    FUNCTION celsiustoFahrenheit(celsius)
        RETURN (9 / 5) * celsius + 32
    END FUNCTION

    BEGIN MAIN
        OPEN scanner for user input

        FOR i FROM 1 TO 4 DO
            PRINT "Enter temperature in Celsius for conversion " + i + ": "
            GET input as celsius
            CALL celsiustoFahrenheit(celsius) TO calculate fahrenheit
            PRINT celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit."
        END FOR

        CLOSE scanner
    END MAIN

END