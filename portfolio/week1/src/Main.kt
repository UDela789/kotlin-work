// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array:String){

    if(args.size < 3){
        println("Error: values for a, b, c required on command line")
    }

    val a = arg[0].toFLoat
    val b = arg[1].toFLoat
    val c = arg[2].toFLoat

    val s = (a + b + c) / 2
    val area  = math.sqrt(s(s-a)(s-b)(s-c))

}
