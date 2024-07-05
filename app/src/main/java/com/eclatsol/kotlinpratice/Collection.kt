package com.eclatsol.kotlinpratice

fun main() {
    println("Vasudev krushna")

    //The List
    //Imutable List
    val imList = listOf<Int>(
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10
    ) //Static hoi che //Chanhe nathi thati list//Add remove nathi kari shakta value

    val imList1 = listOf<Any>(1, "15", true, 5.5, 55555.50)

    println(imList1)

    for (i in imList.indices) {
        println("imList $i")
    }

    //Mutable List
    val mList = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    mList[1] = 10
    println("The mutable list ${mList[1]},${mList}")

    val mList1 = mutableListOf("Hello", "World")
    //mList1[0] = 12 //Cannot be assign integer value //Kem ke mutablelist ma string value pass
    mList1[0] = "Good Morning"

    println(mList1)

    val mList2 = mutableListOf("Hello", "World", mutableListOf("Awosome", "Good"))
    println(mList2)


    mList2[1] = "Good"

    mList2.remove("Hello") //Element thi remove karvi shavi
    mList2.removeAt(1) //Index thi remove karvi shavi


    println("Remove$mList2")

    mList2.add(mList2.toMutableList())
    for (i in mList2) {
        println("${i.toString().replace("[", "").replace("]", "")}")
        println("MutableList $i")
    }

    val mList3 = mutableListOf<Any>("Nice", "Work")
    mList3[1] = 15
    println("${mList3.toString().replace("[", "").replace("]", "")}")
    println("The String is $mList3")

    mList3.addAll(mList1)
    println(mList3.toString().replace("[", "").replace("]", ""))
    println(mList3)


    imList.filter {
        it % 2 == 0
    }.map {
        it * it
    }.forEach {
        println("The filter is $it")
    }

    //The Set
    //Immutable set

    val iMSet =
        setOf(1, 2, 3, 4, 5, 6, 6, 7, 7) //Duplicate print nahi kare set//Duplicate value not allow
    println(iMSet) //Value chanhe nathi thati

    //Mutable Set
    val mSet = mutableSetOf<Any>(1, 2, 3, 4, 5, 6, 7, "Good", true, 50.60)
    println(mSet) //Value change thay che

    val mIntSet = mutableSetOf<Int>(15, 20, 25)
    println(mIntSet)

    val mAnySet = mutableSetOf<Any>("Black", "White", "Blue")
    mAnySet.add("Orange")
    println(mIntSet)

    mAnySet.remove("Black")
    println(mAnySet)


    val mSet2 = mutableSetOf(25, 30, "Good", "WellDone")
    mSet.addAll(mSet2)
    mSet2.add(15)
    println(mSet2.toString().replace("[", "").replace("]", ""))

    mSet2.remove("Good")
    println(mSet2)

    val mutablesetA = mutableSetOf(56, 74, 28, 85, 36, 22, "India", "UK", "USA")

    println("The first element of the set is " + mutablesetA.first())  //First Element print
    println("The last element of the set is " + mutablesetA.last()) //Last Element print
    println("The position of the element 85 is " + mutablesetA.indexOf(85)) //Element thi index find kare che
    println("Removing 4 elements from starting of the set: " + mutablesetA.drop(4))  // 4 length ne drop kare che

    //The Map
    //Imuatable map
    val iMmap = mapOf<Int, String>(1 to "Hello", 2 to "Nice", 3 to "Good Morning")
    println(iMmap) //Static value rahe che //Fix Value Define

    //Mutable map
    val mMap = mutableMapOf<Int, Any>(1 to "How are you?", 2 to "Nice", 3 to true, 4 to 15)
    mMap.putAll(iMmap)

    mMap[2] = "WellDone"
    println("Mutable map of $mMap")

    for ((key, value) in mMap) {
        println("$key = $value")
    }

    for (maps in mMap.keys) {
        println("Map is $maps")
    }

    for (maps in mMap.values) {
        println("Map is $maps")
    }

    //ArrayList
    val list = ArrayList<String>()
    list.add("Good Morning")
    list.add("Hello")
    list.add("How Are You?")

    list[1] = "Very Nice"

    list.removeAt(1)
    list.remove("Hello")

    println(list)

    val nums = 100
    if (nums > 100) {
        println("Number is greaterthan")
    } else if (nums < 100) {
        println("Number is lessthan")
    } else {
        println("Condition is false")
    }

    val num = 18
    when (num) {
        15 -> {
            println("Fifteen")
        }
        in 16..20 -> {
            println("This number is between 16 to 20")
        }
        else -> {
            println("Nothing")
        }
    }

    val number = 20
    val num1 = when(number){
        20->{
            "Twenty"
        }
        else -> {
            "Not found"
        }
    }
    println(num1)

    val (a,b) = Pair("A",true)
    println("Pair $a $b")

    var name = Pair("Hello",Pair(true,"Hello"))
    println("${name.first}")
    println("${name.second.first}")

    var userName = Triple(15,"Hello",Triple(25,"Hello",50.25))
    println(userName.third.second)

    var name1 = Pair(Pair("Two","Three"),"Hello")
    println(name1.first.first)
    println(name1.first.second)
    println(name1.second)

    var name2 = Pair(Pair("Hello","World"),Pair("Krushna","Radha"))
    println(name2.first)
    println(name2.second)
    println(name2.first.toString().replace("(","").replace(")",""))
    println(name2.second.toString().replace("(","").replace(")",""))

    println()
    println("Triple Data")
    val name3 = Triple("Good","Hello",Triple("High","Medium","Low"))
    println(name3.first)
    println(name3.second)
    println(name3.third.first)


}

class Collection {

}