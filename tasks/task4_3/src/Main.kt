// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3){
        println("Error: filename required as sole argument")
        exitProcess(1)
    }

    val input_0 = args[0].toFloat()
    val input_1  = args[1].toFloat()
    val input_2 = args[2].toFloat()

    val total = input_1 + input_0 + input_2
    val avg = (total / 3)
    val mark = avg.roundToInt()

    val grade = when (mark) {
        in 0..39   -> "Fail"
        in 40..69  -> "Pass"
        in 70..100 -> "Distinction"
        else -> "?"
    }   

    println(grade)
}
