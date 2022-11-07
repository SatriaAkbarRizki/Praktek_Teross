package com.OOP.ReadAndWrite

import com.aspose.words.Document
import java.io.File
import java.nio.file.Paths
import java.util.*

var nameFile : String = ""
class Convert_ToWord {
    val input = Scanner(System.`in`)
    var collectionNameFile = ArrayList <String>()
    val locationFile : String = Paths.get("").toAbsolutePath().toString()   // Lokasi File
    var listDirectory : (whereLocation : String) -> Unit = {
        File(it).list().forEach { collectionNameFile.add(it) } // Masukkin nama file ke array
    }

    fun ConvertNow()
    {
        listDirectory(locationFile)
        (0..18).forEach{ print("=") }
        println("\n\tList FIles")
        (0..18).forEach{ print("=") }; println()
        (collectionNameFile).forEach{ println(it) }
        (0..18).forEach{ print("=") }; println()

        getFile2(collectionNameFile)
        println()
        println("Convert Txt to Word, Now...")
        print("Please Wait..")
        nameFile.toWord(nameFile)
    }
}


inline fun getFile2 (getCollectionName : ArrayList <String>) : Unit{
    val input = Scanner(System.`in`)

    print("Masukkan File yang ingin dibuka: "); val openFile = input.nextLine()
    getCollectionName.forEach{ if (it.contains(openFile)){
        println("Nama File: " + it)
        nameFile = it
    }else if (it.contains(openFile) == null){
            println("File tidak ditemukan");return@getFile2
        }

    }
}

infix fun String.toWord(name : String): Unit
{
    try
    {
        val doc = Document(name)
        val changeNameFile = name.substringBeforeLast(".txt") + ".docx"
        doc.save(changeNameFile)
        println("Convert to Word Success..")
        println(changeNameFile)
    }catch (e : Exception)
    {
        println(e)
    }

}




