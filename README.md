ScheduleMaker
=============

Generates a work schedule using employee availability and work shifts

Employee: Class
    - name [String]
    - supervisor [boolean]
    - avail [Availability]
    - workingShifts [ArrayList<Shift>]

Availability: Class
    - days [Array of 7 DayAvailability Objects]
    - match(Shift s)

DayAvailability: Class
    - startTime [Date]
    - endTime [Date]

Shift: Class
    - type [String]
    - supervisor [boolean]
    - startTime [Date]
    - endTime [Date]

Schedule: Class
    - shifts [ArrayList<Shift>]
    - isGoal()
