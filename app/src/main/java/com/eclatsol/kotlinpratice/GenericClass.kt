package com.eclatsol.kotlinpratice

fun main() {

    var name : String?  =  null
    name = "Modi"
    println("${name ?: "Jemis"}")

    val genericClass = GenericClass(15)
    println("${genericClass.addData(15, 15, 20)}")

    val arrayList = ArrayLists(arrayOf(1, 2, 3, 4, 5))
    arrayList.findElement((3)) { index, element ->
        println("The Index is $index")
        println("The Element is $element")
    }

    justForTesting(15, true)
    foundElement(arrayOf(1, 2, 3, 4, 5), 5) { index, element ->
        println("The Index $index")
        println("The Value $element")
    }
}

fun <T, S> justForTesting(param1: T, param2: S) {
    println("Hello Testing $param1")
    println("Hello Testing $param2")
}

fun <T> foundElement(array: Array<T>, findEelement: T, element: (Int, T?) -> Unit) {
    for (i in array.indices) {
        if (array[i] == findEelement) {
            element(i, array[i])
            return
        }
        element(-1, null)
        return
    }
}

class GenericClass<T>(private val data: T) {

    var ab = data

    init {
        println("How are you? $data")
    }

    fun addData(a: Int, b: T, c: Int) {
        println("Good Morning $a")
        println("Good Morning $b")
        println("Good Morning $c")
    }
}


class ArrayLists(private val array: Array<Int>) {
    fun findElement(findElement: Int, element: (Int, Int?) -> Unit) {
        for (i in array.indices) {
            if (array[i] == findElement) {
                element(i, array[i])
                return
            }
        }
        element(-1, null)
        return
    }
}