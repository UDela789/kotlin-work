// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt



class Triangle(val sideA: Double, val sideB: Double, val sideC: Double){
    val s = (sideA + sideB + sideC) / 2 // computes 's' for herons formula

    init {
        require( ((sideA + sideB) > sideC) && ((sideB + sideC) > sideA) && ((sideA + sideC) > sideB) )
    }



    fun perimeter(): Double{
        return sideA + sideB + sideC
    } 

    fun semiPerimeter(): Double{
        return (sideA + sideB + sideC) / 2
    }  

    fun area(): Double{
        val semiPerimeter = semiPerimeter()
        return sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC))  
    } 

    override fun toString() = ("Triangle(${sideA}, ${sideB}, ${sideC})")

}


