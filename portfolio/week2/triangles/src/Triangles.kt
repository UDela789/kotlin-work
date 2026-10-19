// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean {
    val side1 = triangle.first
    val side2 = triangle.second
    val side3 = triangle.third

    if( ((side1 + side2) > side3) && ((side2 + side3) > side1) && ((side1 + side3) > side2) ){
        return true
    }
    else{
        return false
    }

    

}

fun triangleArea(triangle: Triangle): Double {
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third
    val valid = isValidTriangle(triangle)
    val s = ((a + b + c) * 0.5)
    val area = sqrt(s*(s-a)*(s-b)*(s-c))
    

    if(!(valid)){
        return 0.0
    }
    else if(valid){
        val area = sqrt(s*(s-a)*(s-b)*(s-c))
        return area
    }
    else{
        return 0.0
    }

    

}
