## Pseudocode

BEGIN

FUNCTION eliminateDuplicates(list)
    DECLARE tempArray of same length as list
    SET count TO 0

    FOR i FROM 0 TO length of list - 1
        SET isDuplicate TO false

        // Check for duplicates
        FOR j FROM 0 TO count - 1
            IF list[i] EQUALS tempArray[j] THEN
                SET isDuplicate TO true
                BREAK inner loop
            END IF
        END FOR

        // If value is not a duplicate, store it
        IF isDuplicate IS false THEN
            tempArray[count] ← list[i]
            INCREMENT count
        END IF
    END FOR

    // Create final result array with exact size
    CREATE resultArray of size count
    FOR i FROM 0 TO count - 1
        resultArray[i] ← tempArray[i]