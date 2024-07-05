package com.eclatsol.kotlinpratice

fun main(){


    println("Today is ${EnumClass.WEDNESDAY}")
    println("Tomorrow is ${EnumClass.THURSDAY}")
    println("Direction is ${Direction.NORTH}")
    println("Gender is ${Gender.MALE}")

    for (day in EnumClass.values()){
        if (day.holiday){
           println("$day is a holiday")
        }
    }

    for (gender in Gender.values()){
        if (gender.isGender){
            println("The Gender is $gender")
        }
    }

    for (dir in Direction.values()){
        println("$dir")
        when (dir.direct){
            "NORTH" -> {
              println("Direction is North")
            }
            "SOUTH" ->{
                println("Direction is South")
            }
            "EAST" ->{
                println("Direction is East")
            }
            "WEST" ->{
                println("Direction is West")
            }
            else -> {
                println("Condition is false")
            }
        }
    }
}




enum class EnumClass(val holiday : Boolean = false) {
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY(true),
    THURSDAY,
    FRIDAY,
    SATURDAY(true)
}

enum class Direction(val direct : String = "S") {
    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W")
}

enum class Gender(var isGender : Boolean = false){
    MALE(MainClass.isMale),
    FEMALE(MainClass.isFemale),
    OTHER(MainClass.isOther)
}
