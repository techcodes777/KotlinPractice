package com.eclatsol.kotlinpratice

fun main(){

    val lambdaExpression = LambdaExpression()
    println("The Lambda ${num(25)}")
    println("The number is : ${number(15,15)}")
    println(data())
    println("The number is ${number2()}")
    println("The number3 is ${number3("Good")}")
    println("The number4 is ${number4()}")
    println("The number5 is ${number5("I am fine")}")
}

val num = {p : Int -> p*p}

val number : (Int,Int) -> Int = {p,r -> p + r}

val booleanData : (Boolean) -> Boolean = {isValue -> true}

val data  = { println("Good Morning") }

val number2 : () -> Unit = { println("Hello How are you?") }

val number3 : (String) -> Unit = {strName -> println("Thanks for god") }

val number4 : () -> Unit = { println("Good Morning")}

val number5 : (String) -> Unit = { println("Hello I am looking for job change") }



class LambdaExpression {



}