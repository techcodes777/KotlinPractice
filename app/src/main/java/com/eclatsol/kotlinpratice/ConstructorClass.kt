package com.eclatsol.kotlinpratice

fun main() {
    println("Hare krushna")
    println("RadhaRani")
    val constructorClass = ConstructorClass("Hello")
    StudentData()


    //MyData(name = "Narayan") //First Constructor
    //MyData(num = 5, name = "Narayan") //Second constructor
//    MyData(b = 1, c = 2, a = 5) //Third constructor
    MyData(15,25) //Third constructor //Cannot be pass value in constructor invokation//Method Invokation
}

class ConstructorClass(private val data: String) { // This is primary constructor //Without constructor keyword
    init {
        println("${data} Good Morning")
    }
}

class StudentData constructor(val name: String = "Null") { //With constructor keyword //This is primary constructor

    init {
        println("My name is $name")
    }
}

class MyData {

    init {
        println("Good Morning")
    }

    constructor(name: String = "Jemis") {
        println("My nane is $name")
    }

    constructor(num: Int = 1, name: String = "Good") {
        println("My roll number is $num")
    }

    constructor(a: Int = 15, b: Int = 15, c: Int = 20) {
        println("The sum of three ($a, $b, $c) value is ${a+b+c}")
    }
}