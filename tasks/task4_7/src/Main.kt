// Task 4.7: finding the longest line in a file
import kotlin.io.path.*

fun main(args: Array<String>) {
    
    val path = Path(args[0])


    var maxLength = 0
    var longestLine = 0
    var line = 1



    path.forEachLine {
        if(it.length > maxLength) {
            maxLength = it.length
            longestLine = line
        }

        line += 1
    }

    println("Longest line length: ${maxLength}, Longest line: ${longestLine}")
}
