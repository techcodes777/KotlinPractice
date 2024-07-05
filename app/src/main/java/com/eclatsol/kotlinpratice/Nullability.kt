package com.eclatsol.kotlinpratice

fun main(){

    println("Hello World")

    val name1 : String? =  null

//    println("The name is ${name1!!.length}") //Double exlamation mark no matlab execute code karavo
    //Give me error nullpointerexception
    //Runtime per value assign thavani j che

    val name2 : String? = null
    val nam = name2 ?: "Jemis" //Aa format thi null value assign thashe
    println(name2) //Output : null
    println(name2 ?: "Jemis") //Output : Jemis
    println(nam)
}

class Nullability {


}