package com.testLocation

import java.io.File
import java.nio.file.Paths

fun main()
{
    val locationMe : String = Paths.get("").toAbsolutePath().toString() // Cari letak class berada
    println(locationMe)

    val listDirectory = File(locationMe).list().forEach { println(it) }
    val location = locationMe.substringAfterLast(".")
    println(location)
}
