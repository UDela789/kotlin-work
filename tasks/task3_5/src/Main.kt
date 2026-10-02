// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val text = "some text"
    val path = Path("test.txt")
    path.writeText(text)
    path.appendText(text)
    
    val fileContents = path.readText()
    println(fileContents)
}
