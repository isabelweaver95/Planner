package production.planner

class Calander {
    val Year: Int
    var StartDay =
        0 //This will be represented by 0,1,2...6 corresponding to the day of the week that that year starts on
    var month = 0

    constructor() {
        Year = 0 // Or provide a default value
    }

    constructor(year: Int) {
        Year = year
        calculateStartDay()
    }


    fun calculateStartDay() {
        // We have to calculate how many days have happened from a start date
        var count = 0
        var yearCount = 1753  // this year started on a Monday
        while (yearCount != Year) {
            if (isLeapYear(yearCount)) {
                count += 366
            } else {
                count += 365
            }
            yearCount++
        }

        StartDay = count % 7
    }


    fun isLeapYear(year: Int): Boolean {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true
                } else {
                    return false
                }
            } else
                return true
        } else
            return false
    }


    fun displayYear() {
        // This function should display the whole year.
        var month = 1 // Start with January
        var day = 1
        var daysInMonth = 0

        while (month <= 12) {
            fun displayYear() {
                var month = 1 // Start with January
                var day = 1
                var daysInMonth = 0

                // Adjust the start day of the week
                var currentWeekDay = StartDay

                while (month <= 12) {
                    val monthName = when (month) {
                        1 -> "January"
                        2 -> "February"
                        3 -> "March"
                        4 -> "April"
                        5 -> "May"
                        6 -> "June"
                        7 -> "July"
                        8 -> "August"
                        9 -> "September"
                        10 -> "October"
                        11 -> "November"
                        else -> "December"
                    }
                    println(monthName)

                    println("S  M  T  W  T  F  S")

                    daysInMonth = when (month) {
                        1, 3, 5, 7, 8, 10, 12 -> 31
                        4, 6, 9, 11 -> 30
                        else -> if (isLeapYear(Year)) 29 else 28
                    }

                    repeat(currentWeekDay) {
                        print("   ") // Pad the days before the start day
                    }

                    var currentDay = 1

                    while (currentDay <= daysInMonth) {
                        if (currentWeekDay == 7) {
                            println() // Move to the next line after printing Saturday
                            currentWeekDay = 0
                        }
                        print("${currentDay.toString().padEnd(3)}")
                        currentDay++
                        currentWeekDay++
                    }

                    println() // Move to the next line after printing all days of the month
                    month++
                }
            }

        }
    }
}
