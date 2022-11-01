package com.OOP.ReadAndWrite

import java.util.*


val  nameProgram = arrayOf(null,"Read File", "Write FIle", "Convert File to Word")

val listProgram : (pilihan : Int) -> Unit = {
    val showFile = ReadOperation()
    when(it)
    {
        1 -> showFile.ReadShow()
        else -> {
            println("Pilihan not found")
        }
    }
}



fun main()
{
    val inputUser = Scanner(System.`in`)
    print("Ingin Memakai Program Ini [Y/N] -> ")
    val pilihanUser = inputUser.nextLine()
//    val showFile = ReadOperation()
    if(pilihanUser.equals("Y", ignoreCase = true))
    {
        for (x in 1..nameProgram.size){ println("[" + "$x" + "]" + " " + nameProgram[x])
        if(x > 2){break}
        }

        print ("Pilih nomor program: "); val selectUser = inputUser.nextInt()
        listProgram(selectUser)

//        showFile.ReadShow()
    }
    else
    {
        println("Program Berhenti..")
    }
}