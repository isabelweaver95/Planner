package production.planner

class Calander {
    val Year: Int = 0
    var StartDay = 0 //This will be represented by 0,1,2...6 corrisponding to the day of the week that that year starts on
    var month = 0

    constructor() {

    }

    constructor(year: Int) {
        Year = year
        calculateStartDay()
    }

    fun calculateStartDay() {
        //We have to calculate how many days have happened from a start date
        val count: Int = 0
        val yearCount = 1753  //this year started on a monday
        while (yearCount - Year != 0) {
            if (isLeapYear(count)) {
                count += 366
            } else
                count += 365

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
        var month = 1
        var day = 1
        var daysInMonth = 0

        while (month != 11) {
            println("S M T W T F S")
            var daysInMonth = 0
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                daysInMonth = 31
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30
            } else {
                if (isLeapYear(Year)) {
                    daysInMonth = 29
                } else
                    daysInMonth = 28

                while (day != daysInMonth) {
                    if (StartDay == 0) {
                        //Monday
                        print("  $day")
                        StartDay++
                        day++
                    } else if (StartDay == 1) {
                        //tuesday
                        print("    $day")
                        StartDay++
                        day++
                    } else if (StartDay == 2) {
                        //Wednesday
                        print("      $day")
                        StartDay++
                        day++
                    } else if (StartDay == 3) {
                        //Thurdsay
                        print("        $day")
                        StartDay++
                        day++
                    } else if (StartDay == 4) {
                        //Friday
                        print("          $day")
                        StartDay++
                        day++
                    } else if (StartDay == 5) {
                        //Saturday
                        print("            $day")
                        StartDay++
                        day++
                    } else {
                        //Sunday
                        print(day)
                        StartDay = 0
                        day++
                    }
                }
            }
        }
    }
}