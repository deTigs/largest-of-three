
fun main() {
    println("Enter the first number:")
    val num1 = readlnOrNull()?.toIntOrNull()

    println("Enter the second number:")
    val num2 = readlnOrNull()?.toIntOrNull()

    println("Enter the third number:")
    val num3 = readlnOrNull()?.toIntOrNull()

     if (num1 is Int && num2 is Int && num3 is Int){
        if (num1 > num2 && num1 > num3) {
            println("The largest number between $num1, $num2 and $num3 is $num1")
        }
        else if (num2 > num1 && num2 > num3) {
            println("The largest number between $num1, $num2 and $num3 is $num2")
        }
        else {
            println("The largest number between $num1, $num2 and $num3 is $num3")
        }
    }
    else {
        println("Please enter a valid integer for all the numbers!")
    }

}