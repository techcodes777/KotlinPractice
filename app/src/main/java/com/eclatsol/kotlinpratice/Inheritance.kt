package com.eclatsol.kotlinpratice

fun main() {

    val students = Students()
    println("This is marks of students ${students.name},${students.studentMark(5, 10)}")
    println("This is marks of students ${students.name},${students.studentMark(5, 10, 15)}")
}

class Students : Person() {

    override val name: String = "Good"

    override fun studentMark(a: Int, b: Int): Int { //RunTime Polymorphisom //RunTime per method ni defination ne change kari shako shavo //Method overriding kahvay che
        val sum = super.studentMark(a, b)
        println("Change Definition")
        return sum / 2
    }

//        get() = super.name
}

open class Person {

    open val name: String =
        "Harry" //Method overriding karvanu hoi tyare variable ane method bane open karva pade kem ke by default funal che

    open fun studentMark(a: Int, b: Int): Int {
        return a + b  //Method overloading //Compile time polymorphisom
    }

    fun studentMark(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}

class Inheritance {
}