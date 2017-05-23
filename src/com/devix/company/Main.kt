package com.devix.company

object Main {


    @JvmStatic fun main(args: Array<String>) {

        //Defining local variables
        val a: Int = 1
        val b: Int = 2
        val c: Int
        c = 3

//      Mutable variable
        var x = 5
        x += 1

//        Using string templates
        var d = 1
        val s1 = "a is $d"
        d = 2

        val s2 = "${s1.replace("is", "was")},but now is $a"

        println("Hola Mundo Kotlin")
        println()

        println("Funtion with an expression body and inferred return type")
        println(sum(4, 2))
        println()

        println("Funtion returning no meaningful value:")
        printSum(a, b)
        println()

        println("Mutable variable")
        println(x)

        println("Using string templates")
        println(d)
        println(s1)
        println(d)

        println("Using conditional expressions")
        println(maxOf(a, b, c))

        println("Using if as an expressions")
        println(maxOfA(a, b))
        println()

        println("Using nullable values and checking for null")
        printProduct(s1, s2)


        println("Using a for loop")
        println()
        val items = listOf("apple", "banana", "kiwi")
        for (item in items) {
            println(item)
        }
//or
        println()
        println("Using a for loop")
        println()
        val itemsA = listOf("A", "B", "C")
        for (index in itemsA.indices) {
            println("item at $index is ${items[index]}")
        }

        println()
        println("Using a while loop")
        println()

        val itemsB = listOf("C", "D", "E")
        var index = 0;
        while (index < itemsB.size) {
            println("item at $index is ${items[index]}")
            index++
        }

        println()
        println("Using when expression")
        println()
        describe(a)

        println()
        println("Using ranges")
        println()
        val y = 10
        val z = 9
//      Using ranges..Check if a number is within a range using in operator
        if (y in 1..y + 1) {
            println("fits in range")
        }

        println()
        println("Check if a number is out of range")
        println()
        val list = listOf("A", "B", "C")
        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }
        if (list.size !in list.indices) {
            println("list size is out of valid list indices too")
        }

        println()
        println("Iterating over a range")
        for (x in 1..5) {
            println(x)
        }

        println()
        println("Iterating over a progression")
        for (x in 1..10 step 2) {
            println(x)
        }
        println()
        for (x in 9 downTo 0 step 3) {
            println(x)
        }

        println()
        println("Iterating over a collection")
        for (item in items) {
            println(item)
        }

        println()
        println("Checking if a collection contains an object using in operator")
        when {
            "orange" in items -> println("juicy")
            "apple" in items -> println("apple is fine too")
        }

    }

    //        Funtion with an expression body and inferred return type:
    fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    //        Funtion returning no meaningful value:
    fun printSum(a: Int, b: Int): Unit {
        println("Sum of $a and $b is ${a + b}")
    }

    //    Using conditional expressions
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //    Using if as an expression
    fun maxOfA(a: Int, b: Int) = if (a > b) a else b

    //Using nullable values and checkinf for null 1
    fun parseInt(str: String): Int? {
        println(str)
        return 1;
    }

    //    Using nullable values and checking for null 2
    fun printProduct(args1: String, args2: String) {
        val x = parseInt(args1);
        val y = parseInt(args2);

        if (x != null && y != null) {
            println(x * y)
        } else {
            println("either '$args1' or '$args2' is not a number")
        }
    }

    //    Using type checks and automatic casts
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            return obj.length
        }
        return null;
    }

    //or

    fun getStringLengthA(obj: Any): Int? {
        if (obj !is String) return null
        return obj.length
    }

//    or even

    fun getStringLengthB(obj: Any): Int? {
        if (obj is String && obj.length > 0) {
            return obj.length
        }
        return null
    }

    //    Using when expression

    fun describe(obj: Any): String =
            when (obj) {
                1 -> "One"
                "Hello" -> "Two"
                is Long -> "Three"
                !is String -> "Not a string"
                else -> "Unknown"
            }


}




