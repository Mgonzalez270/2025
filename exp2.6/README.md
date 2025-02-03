## Pseudocode

BEGIN

    BEGIN MAIN
        OPEN scanner for user input

        WHILE TRUE DO
            PRINT "Enter subtotal: "
            GET input as subtotal
            PRINT "Enter gratuity rate (as a percentage): "
            GET input as gratuityRate
            
            CALCULATE gratuity = subtotal * (gratuityRate / 100)
            CALCULATE total = subtotal + gratuity

            PRINT "Gratuity: " + gratuity
            PRINT "Total: " + total

            PRINT "Do you want to perform another calculation? (y/n): "
            GET input as response

            IF response equals "n" OR response equals "N" THEN
                BREAK
            END IF

        END WHILE

        CLOSE scanner
    END MAIN

END