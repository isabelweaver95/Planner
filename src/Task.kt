class Task {
    var Task: String = " "
    var Completed: Boolean = false

    fun set_task(){
        println("Please enter the task you would like to add:")
        var input = readLine()

        // Assuming Task and Completed are global variables
        Task = input ?: ""
        Completed = false
    }

    fun isCompleted(): Boolean{
        return Completed
    }

    fun completeTask(){
        println("Have you completed $Task? Y/N")
        var input = readLine()

        if(input == "y" || input == "Y"){
            Completed = true
        }
        else if(input == "n" || input == "N"){
            println("You got this!")
        }else{
            println("Invalid input. Please try again.")
        }
    }

}