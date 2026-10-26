// Task 7.7.1: statistics functions

fun median(numbers: List<Float>): Float{
    var total = numbers.size
    val sorted = numbers.sorted()

    if (total == 0){
        throw IllegalArgumentException()
    }

    if (total % 2 != 0){
        val midpoint = (total / 2)
        return sorted[midpoint]

    }
    else{
        val upper = sorted[total / 2]
        val lower = sorted[total / 2 - 1]
        return (lower + upper) / 2
        
    }
}

fun stats(numbers: List<Float>): String{
    val min = numbers.min()
    val max = numbers.max()
    val sum = numbers.sum()
    val average = numbers.sum() / numbers.size
    val median = median(numbers)

    return "min: ${min}, max: ${max}, sum: ${sum}, average: ${average}, median: ${median}"

}


