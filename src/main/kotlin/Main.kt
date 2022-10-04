package ie.setu.controlflow

import java.lang.Integer.parseInt

fun main(args: Array<String>) {
    println("The max number is:" + maxOf(4,6));
    printValue(7)
    printRange(30)
    printExpressionResult(12, "12")
}

fun printValue(value : Int){
    when(value){
        1 -> println ("The value is One")
        2 -> println ("The value is Two")
        in 3..5 -> println ("The value is between Three and Five")
        6,7,8 -> println("THe value is six, seven and eight")
        else -> {
            println ("The value is: " + value)
        }
    }
}

fun printRange(value: Int){
    when(value){
        in 1..10 -> println ("Between 1..10");
        !in 10..20 -> println ("Outside 10..20")
    }
}

fun printExpressionResult(numberValue: Int, stringValue: String){
    when (numberValue){
        parseInt(stringValue) -> println("stringValue holds the same number as numberValue")
        else -> {
            println("stringValue is not the same number as numberValue")
        }
    }
}

fun maxOf(a: Int, b: Int) =
    if (a > b) {
        print("a is greater than b.  ")
        a
    }else {
        print("b is greater than a.  ")
        b
    }