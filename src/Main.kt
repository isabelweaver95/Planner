import production.planner.Calander

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Welcome to the Planner program!")
    var number: Int? = null
    val planner = Calander()
            while (number == null) {
        println("Please enter the year you would like to view and plan.")
        val input = readLine()
        number = input?.toIntOrNull()
        if (number == null) {
            println("Please enter a valid input. Try again.")
        }

        planner.displayYear()
    }

}


