package com.OOP.ReadAndWrite

import java.util.*


val  nameProgram = arrayOf(null,"Read File", "Write FIle", "Convert File to Word")

val listProgram : (pilihan : Int) -> Unit = {
    val readFile = ReadOperation()
    val writeFile = WriteOperation()
    when(it)
    {
        1 -> readFile.ReadShow()
        2 -> writeFile.outputFile()
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
    if(pilihanUser.equals("Y", ignoreCase = true))
    {
        for (x in 1..nameProgram.size){ println("[" + "$x" + "]" + " " + nameProgram[x])
        if(x > 2){break}
        }

        print ("Pilih nomor program: "); val selectUser = inputUser.nextInt()
        listProgram(selectUser)
    }
    else
    {
        println("Program Berhenti..")
    }
}