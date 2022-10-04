package ie.setu.controlflow

import java.lang.Integer.parseInt

fun main(args: Array<String>) {
    println("The max number is:" + maxOf(4,6));
    println(printValue(7))
    printRange(30)
    println(printExpressionResult(12, "12"))
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
    println(printAnimal("elephant"))
}

fun printValue(value : Int) = when(value){
    1 -> println ("The value is One")
    2 -> println ("The value is Two")
    in 3..5 -> println ("The value is between Three and Five")
    6,7,8 -> println("THe value is six, seven and eight")
    else -> {
        println ("The value is: " + value)
    }
}

fun printRange(value: Int){
    when(value){
        in 1..10 -> println ("Between 1..10");
        !in 10..20 -> println ("Outside 10..20")
    }
}

fun printExpressionResult(numberValue: Int, stringValue: String) = when (numberValue){
    parseInt(stringValue) -> "stringValue holds the same number as numberValue"
    else -> {
        "stringValue is not the same number as numberValue"
    }
}

fun printAnimal(aString: String) = when {
    aString.equals("Dog") -> "A dog"
    aString.equals("Cat") -> "A cat"
    aString.contains("pig") -> "A pig of some sort"
    aString.length == 0 -> "Empty String..no Animal"
    else -> {
        "No identifiable animal"
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

fun describe(obj: Any): String = when (obj){
    1 -> "One"
    "Hello" -> "A Greeting"
    is Long -> "Long Var"
    !is String -> "Not a String"
    else -> "Unknown"
}