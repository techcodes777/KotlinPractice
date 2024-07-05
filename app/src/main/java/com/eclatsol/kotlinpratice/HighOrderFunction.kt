package com.eclatsol.kotlinpratice

fun main() {

    data(productName)
    order(nums)
    println("${dataAdd(15, 25, productName)}")
    println("${dataAdd(15, 25, productName)}")
    println( sumTwoData(5, 10) { a, b ->
        a + b
    })

    findElement(arrayOf(1,2,3,4,5),5){
        index,element ->
        println("Index is $index")
        println("Index is $element")
    }

    twoAddData(2,15, productName)
    allData(15,25)


    multiplyData(param1 = 1, param2 = 10)
    multiplyData(param2 = 10, param1 = 15, param3 = 25)

    val allDataFunc = allData(15,15)
    println(allDataFunc)
}

fun multiplyData(param1 : Int = 1,param2 : Int= 3) {
    println("MultiplicationData ${param1 * param2}")
}

fun multiplyData(param1 : Int,param2: Int,param3 : Int) : Int{
    return param1 + param2 + param3
}

val allData : (Int,Int) -> Int = {p,r -> p  + r}

val productName = { println("Good Morning") }

val nums: (Int, Int) -> Int = { a, b -> a + b }

fun data(data: () -> Unit) {
    println("Hello ${data()}")
}

fun order(data: (Int, Int) -> Int) {
    println("Good Morning ${data(5, 10)}")
}

fun dataAdd(a: Int = 5, b: Int = 10, c: () -> Unit): () -> Unit {
    println("Data is ${a + b}")
    c()
    return c
}

fun sumTwoData(a: Int, b: Int, operate: (Int, Int) -> Int): Int {
    return operate(a, b)
}

fun twoAddData(a : Int, b : Int , c : () -> Unit) : () -> Unit{
    println("The a is $a")
    println("The a is $b")
    println("The a is $c")
    c()
    return c
}

fun findElement(array : Array<Int> , findElement: Int,element : (Int,Int?) -> Unit){
    for (i in array.indices){
        if (array[i] == findElement){
            element(i,array[i])
            return
        }
    }
    element(-1, null)
    return
}

fun allData(a : Int, b : Int) : Int{
    return  a + b
}
class HighOrderFunction {
}