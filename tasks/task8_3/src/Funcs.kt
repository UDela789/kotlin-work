// Task 8.3: functions for temperature analysis

import kotlin.io.path.Path
import kotlin.io.path.forEachLine

typealias Record = Pair<String,Double>

fun fetchData(filename: String) = buildList {
    // Finish the implementation of this function
    val path = Path(filename)
    
    // for each line
    path.forEachLine {
        // split lines into separate lists 
        var splitted = it.split(",")
       add(Record(splitted[0], splitted[1].toDouble()))      
    }
    
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
