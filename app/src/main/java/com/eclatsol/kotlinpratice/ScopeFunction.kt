package com.eclatsol.kotlinpratice

fun main(){
    val scopeFunction = ScopeFunction()
    println("Hello World ${scopeFunction.names}")
    println("Hello World ${scopeFunction.data}")
    println("Hello World ${scopeFunction.num}")   //Normal rite karelu che

    var name : String? = null
    name = "Jemis"

    val print = name?.let {
        //it per thi variable ne access kari shaku
        //Tame direct it ne use kari shako
        println("The length is ${it.length}")
        println("The reverse is ${it.reversed()}")
        println("The num $it")
//        it.reversed()
        "Good Morning Now"
    }
    println(print)

    val name3 = ScopeFunction().apply {
        names = "Krishna"
        data = 101
        num = true
        "Complete apply scope function"
    }
    println("${name3.names}")

     with(name){
        this.length //This keyword use no karo to pan chale
        num
    }

    val witName = with(scopeFunction){
        data
        num
        //Return kare che with (With Scope Function)
    }

    val withLet = name3.let {
        it.names = "Name"
        data  //Return
    }

    val withRun = name3.run {
        data
    }


    println("WithData $witName")

    println("WithLet $withLet")

    println("WithRun $withRun")
    var name4 : String? = null
    name4?.run{
        println("The name is ${name4!!.length}")
        println("The numsr $data")
        println("The num $num")
        num
    }

    val withAlso = name3.also {
        println("With Also")
        it.num
        it    //Property ne access karva mate it no use karvo pade che
        "How are you?"//Return nathi kart
    }
    println("$withAlso")


    name4 = "Hello"
    name4.also {
        println("The Num $it")
        it.length
    }

    val name5 = PersonData().apply {
        username //Direct variable ne access kari shako shavo
        "Not Return"
    }
    println("Apply Scope function is $name5")


    val alsoName = name5.also {
        println("Hare Krushna Hare Krushna Krushna Krushna Hare Hare,\nHare Ram Hare Ram Ram Ram Hare Hare")
        "Not Return"
        it.username //Direct variable access kari shakta nathi
    }

    println(alsoName)

    val lateReturn =name5?.let {
        println("The username is ${it.username}")
        println("The address is ${it.address}")
        println("The mobileno is ${it.mobileNo}")

        "Let Return"
    }
    println(lateReturn)

    val withReturn = with(name5){
        println("Show Data")
        username      //Username direct access kari shako shavo
        "With Return"
    }

    println(withReturn)


    val runData = name5?.run {
        username = "Radharani"
        println("Run Data $username")  //Direct variable ne access lari shake che
        "Run Return"
    }

    println("RunData $runData")


}

class ScopeFunction {
    var names : String = "Hello"
    var data : Int = 101
    var num : Boolean = false
}


class PersonData{

    var username = ""
    var mobileNo = 0
    var address = ""
}