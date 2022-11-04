package com.test2

import java.io.File
import java.util.*

fun main()
{
    val input = Scanner(System.`in`)
    print ("Create nama file: ") ; val nameFile = input.nextLine()
    val createFile = File(nameFile).writeText("Bakso terbang")  // buat nama file berserta isi text
}