package com.test2

import com.OOP.ReadAndWrite.getFileUserName
import com.aspose.words.Document
import java.io.File
import java.nio.file.Paths
import java.util.*

fun main()
{
//    val getRead = ReadOperation()
//    getRead.ReadShow()
    val doc = Document("contoh")    //  ambil file yang mau di convert
    doc.save("Versi Word.docx")     //  save file dengan name yang diinginkan
}

class ReadOperation
{
    val input = Scanner(System.`in`)
    var collectionNameFile = ArrayList <String>()
    val locationFile : String = Paths.get("").toAbsolutePath().toString()   // Lokasi File
    var listDirectory : (whereLocation : String) -> Unit = {
        File(it).list().forEach { collectionNameFile.add(it) } // Masukkin nama file ke array
    }
    var readerFileUser : (reader : String) -> Unit = {// Membaca isi file user

        try{
            (0..18).forEach{ print("=") }; println()
            File(it).forEachLine { println(it) }
            (0..18).forEach{ print("=") }; println()

            println("Reading Sukses")

        }catch (e : Exception)
        {
            println("File Not Found")
        }finally {
            println("Program Berhenti..")
        }
    }

    fun ReadShow()
    {
        listDirectory(locationFile)
        (0..18).forEach{ print("=") }
        println("\n\tList FIles")
        (0..18).forEach{ print("=") }; println()
        (collectionNameFile).forEach{ println(it) }
        (0..18).forEach{ print("=") }; println()

        getFile(collectionNameFile)
        readerFileUser(getFileUserName)

    }
}

inline fun getFile (getCollectionName : ArrayList<String>) : Unit{
    val input = Scanner(System.`in`)

    print("Masukkan File yang ingin dibuka: "); val openFile = input.nextLine()
    getCollectionName.forEach{ if (it.contains(openFile)){      // Error Logic
        println(it)
        getFileUserName = it
    }else if (it.contains(openFile) == null){
        println("File tidak ditemukan");return@getFile
    }

    }

}
