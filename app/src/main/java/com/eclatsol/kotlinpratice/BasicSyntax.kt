package com.eclatsol.kotlinpratice

fun main(){


    for (i in 1..10 ){
        println("Hello World $i")
    }

    for (i in 1..15 step 2){
        println("Second loop $i")
    }

    for (i in 1 until 5){
        println("Third loop  $i")
    }

    for (i in 10 downTo 1){
        println("Down to loop $i")
    }

    val num = if(true){
        10
    }else{
       15
    }

    println("The number is $num")

    val name = "Jemis"
    when(name){
        "Jemis" ->{
            println("Good Morning")
        }
        else ->{
            println("Nothing")
        }
    }

    val nam = when(name){
        "Jemis" ->{
            "Hello Good Morning"
        }
        else ->{
            "Bad Morning"
        }
    }

    println(nam)
}


class BasicSyntax {
}