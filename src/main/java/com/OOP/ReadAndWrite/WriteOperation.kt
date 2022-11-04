package com.OOP.ReadAndWrite

import java.io.File
import java.util.*

class WriteOperation {
    val inputUser = Scanner(System.`in`)

    var createFile : ( String,String) -> Unit = {nameFile, fileContent ->
        val create = File(nameFile + ".txt").writeText(fileContent)
    }

    fun outputFile()
    {
        print("Nama File: "); val nameFile = inputUser.nextLine()
        print("Isi Text: "); val isiText = inputUser.nextLine()
        createFile(nameFile,isiText)
    }
}