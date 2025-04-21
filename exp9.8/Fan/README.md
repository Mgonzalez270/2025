## Pseudocode

DEFINE CONSTANT SLOW = 1
DEFINE CONSTANT MEDIUM = 2
DEFINE CONSTANT FAST = 3

CLASS Fan
    PRIVATE speed = SLOW
    PRIVATE on = false
    PRIVATE radius = 5
    PRIVATE color = "blue"

    CONSTRUCTOR Fan()
        // Initializes with default values

    METHOD getSpeed()
        RETURN speed

    METHOD isOn()
        RETURN on

    METHOD getRadius()
        RETURN radius

    METHOD getColor()
        RETURN color

    METHOD setSpeed(newSpeed)
        SET speed = newSpeed

    METHOD setOn(status)
        SET on = status

    METHOD setRadius(newRadius)
        SET radius = newRadius

    METHOD setColor(newColor)
        SET color = newColor

    METHOD toString()
        IF on IS true THEN
            RETURN "Fan is on: Speed = " + speed + ", Color = " + color + ", Radius = " + radius
        ELSE
            RETURN "Fan is off: Color = " + color + ", Radius = " + radius
        END IF
END CLASS

// Main Program
START MAIN

CREATE fan1 AS new Fan
CALL fan1.setSpeed(FAST)
CALL fan1.setRadius(10)
CALL fan1.setColor("yellow")
CALL fan1.setOn(true)

CREATE fan2 AS new Fan
CALL fan2.setSpeed(MEDIUM)
CALL fan2.setRadius(5)
CALL fan2.setColor("blue")
CALL fan2.setOn(false)

DISPLAY "Fan 1: " + CALL fan1.toString()
DISPLAY "Fan 2: " + CALL fan2.toString()

DISPLAY "Closing Test program"

END MAIN
