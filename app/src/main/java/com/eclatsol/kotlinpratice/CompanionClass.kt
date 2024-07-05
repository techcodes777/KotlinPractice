package com.eclatsol.kotlinpratice

fun main(){

    println("Static allocation ${CompanionClass.name} , ${CompanionClass.name}") //Compile Time Memory Allocation
    println("Dynamic allocation ${CompanionClass().productName} , ${CompanionClass().productName}") //RunTime Memory Allocation
}

class CompanionClass {

    val productName = "Samsung"

    fun mobile(peice : Int) : Int{
        return peice
    }

    companion object{

        val name = "OnePlus"

        fun mobile(price : Int) : Int{
            return price
        }
    }
}