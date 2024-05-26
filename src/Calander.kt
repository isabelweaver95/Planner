package production.planner

class Calander {
    val Year: Int
    var StartDay = 0 //This will be represented by 0,1,2...6 corresponding to the day of the week that that year starts on
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
        var month = 0
        var day = 1
        var daysInMonth = 0

        while (month != 11) {
            if(month == 0){
                println("January")
            }else if(month == 1){
                println("February")
            }else if(month == 2){
                println("March")
            }else if(month == 3){
                println("April")
            }else if(month == 4){
                println("May")
            }else if(month == 5){
                println("June")
            }else if(month == 6){
                println("July")
            }else if(month == 7){
                println("August")
            }else if(month == 8){
                println("September")
            }else if(month == 9){
                println("October")
            }else if(month == 10){
                println("November")
            }else if(month == 11){
                println("December")
            }

            println("S  M  T  W  T  F  S")
            var daysInMonth = 0
            month += 1
            day = 1
            var beginning = true

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                daysInMonth = 31
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30
            } else {
                if (isLeapYear(Year)) {
                    daysInMonth = 29
                } else
                    daysInMonth = 28
            }

            if (StartDay == 1) {
                //Monday
                print("   $day  ")
                StartDay++
                day++
            } else if (StartDay == 2) {
                //tuesday
                print("     $day  ")
                StartDay++
                day++
            } else if (StartDay == 3) {
                //Wednesday
                print("       $day  ")
                StartDay++
                day++
            } else if (StartDay == 4) {
                //Thurdsay
                print("         $day  ")
                StartDay++
                day++
            } else if (StartDay == 5) {
                //Friday
                print("           $day  ")
                StartDay++
                day++
            } else if (StartDay == 6) {
                //Saturday
                println("            $day  ")
                StartDay++
                day++
            } else {
                //Sunday
                print("$day  ")
                StartDay = 0
                day++
            }


            while (day != daysInMonth +1) {
                if (StartDay == 0) {
                    //Monday
                    if(day / 10 == 0){
                        print("$day  ")
                    }else
                        print("$day ")
                    StartDay += 1
                    day++
                } else if (StartDay == 1) {
                    //tuesday
                    if(day / 10 == 0){
                        print("$day  ")
                    }else
                        print("$day ")

                    StartDay += 1
                    day++
                } else if (StartDay == 2) {
                    //Wednesday
                    if(day / 10 == 0){
                        print("$day  ")
                    }else
                        print("$day ")

                    StartDay += 1
                    day++
                } else if (StartDay == 3) {
                    //Thurdsay
                    if(day / 10 == 0){
                        print("$day  ")
                    }else
                        print("$day ")

                    StartDay++
                    day++
                } else if (StartDay == 4) {
                    //Friday
                    if(day / 10 == 0){
                        print("$day  ")
                    }else
                        print("$day ")

                    StartDay++
                    day++
                } else if (StartDay == 5) {
                    //Saturday
                    if(day / 10 == 0){
                        println("$day  ")
                    }else
                        println("$day ")

                    StartDay++
                    day++
                } else {
                    //Sunday
                    if(day / 10 == 0){
                        print("$day  ")
                    }else
                        print("$day ")

                    StartDay = 0
                    day++
                }
            }
            println()
        }
    }
}

