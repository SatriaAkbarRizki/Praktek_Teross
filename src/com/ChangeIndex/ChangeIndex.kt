package com.ChangeIndex

import java.util.Scanner

fun CustomizerArray ( indexArray:Int, elementArray:String)
{
    var NameSiswa = arrayOf("Udi","Otonh","Jaksel")
    for (x in NameSiswa.indices)
    {
        if (x  == indexArray)        // Check bisa index sama dengan index yang diinput
        {
            NameSiswa[indexArray] = elementArray
        }
    }

    println(NameSiswa.toList())
}


fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)       // Deklatasi reader untuk input

    print("Masukkan index nya: " )
    val indexElement:Int = reader.nextInt()     // Membaca input dgn Int

    reader.nextLine()
    print("Masukkan element nya: ")
    val elementSiswa:String = reader.nextLine()

    CustomizerArray(indexElement, elementSiswa)     // Sini dibilang function bukan method
}

//  Program untuk Mengubah Isi Index