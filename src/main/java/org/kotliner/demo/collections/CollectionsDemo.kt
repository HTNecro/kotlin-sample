package org.kotliner.demo.collections

import org.kotliner.demo.dataclass.Gender
import org.kotliner.demo.dataclass.KotlinUser

fun main(args: Array<String>) {
    val list = listOf(
            KotlinUser("1", 16, Gender.FEMALE),
            KotlinUser("2", 17, Gender.MALE),
            KotlinUser("3", 18, Gender.FEMALE),
            KotlinUser("4", 21, Gender.MALE),
            KotlinUser("5", 30, Gender.FEMALE)
    )
    // list.add(KotlinUser("6", 40)) // compile fail

    println(list.first())
    println(list.last())
    println(list.slice(0..2))

    val group = list.filter { it -> it.age >= 18 }.groupBy(KotlinUser::gender)
    println(group[Gender.FEMALE])
    println(group[Gender.MALE])

    val totalAge = list.map(KotlinUser::age).sum()
    println(totalAge)

    val mutable = (1..10).toMutableList()
    mutable.add(100)
    mutable.remove(2)
    println(mutable)

    val map = hashMapOf("1" to 1, "2" to 2)
    println(map["2"])
}