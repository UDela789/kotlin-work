// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3) {
        exitProcess(1)
    }

    val initialTemp = args[0].toFloat()
    val maxTemp = args[1].toFloat()
    val tempIncrement = args[2].toFloat()

    var currentTemp = initialTemp

    while (currentTemp <= maxTemp){
        val farenheit = (currentTemp * 2) + 30
        println("%.1f, %.1f".format(currentTemp, farenheit))
        currentTemp = currentTemp + tempIncrement
    }
}
