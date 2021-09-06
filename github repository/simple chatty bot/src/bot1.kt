package bot

fun main() {
    val botName = "Aid"
    val birthYear = 2021
    println("Hello! My name is $botName")
    println("I was created in $birthYear")
    println("Please, remind me your name.")
    val name = readLine()!!
    println("What a great name u have $name!")

    //It's based on a simple math trick. First, take a look at this formula:
    //age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val remainder3 = readLine()!!.toInt()
    val remainder5 = readLine()!!.toInt()
    val remainder7 = readLine()!!.toInt()
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
    println("Now i will prove to you that i can count to any number you want.")

    val number = readLine()!!.toInt()

    for (i in 0..number) {
        println("$i!")
    }
    println("Let's test your programming knowledge.")

    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")

    val correct = 2
    do {
        val answer = readLine()!!.toInt()
        if (answer == correct) println("Congratulations, have a nice day!") else println("Please, try again.")
    }
    while (answer != correct)
}