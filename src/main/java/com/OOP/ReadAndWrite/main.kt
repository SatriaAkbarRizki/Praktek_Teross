package com.OOP.ReadAndWrite

import java.util.*


val  nameProgram = arrayOf(null,"Read File", "Write FIle", "Convert File to Word")

val listProgram : (pilihan : Int) -> Unit = {
    val readFile = ReadOperation()
    val writeFile = WriteOperation()
    val convertFIle = Convert_ToWord()
    when(it)
    {
        1 -> readFile.ReadShow()
        2 -> writeFile.outputFile()
        3 -> convertFIle.ConvertNow()
        // ADD Fitur baru
        else -> {
            println("Pilihan not found")
        }
    }
}

fun startProgram(pilihanUser : String) {
    val inputUser = Scanner(System.`in`)

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




fun main()
{
    val inputUser = Scanner(System.`in`)
    print("Ingin Memakai Program Ini [Y/N] -> ")
    val pilihanUser = inputUser.nextLine()
    startProgram(pilihanUser)
//    print ("Ingin pakai program lagi: [Y/N] -> "); val continueORbreak : String = inputUser.nextLine()


//    ProccesProgram@for (x in 0..100)
//    {
//        for(x in 0..100)
//        {
//            if(pilihanUser.equals("Y", ignoreCase = true))
//            {
//                for (x in 1..nameProgram.size){ println("[" + "$x" + "]" + " " + nameProgram[x])
//                    if(x > 2){break}
//                }
//                print ("Pilih nomor program: "); val selectUser = inputUser.nextInt()
//                listProgram(selectUser)
//                print ("Ingin pakai program lagi: [Y/N] -> "); val continueORbreak : String = inputUser.nextLine()
//                inputUser.next()
//                val aa = "y"
//
//                for (x in 0..1)
//                {
//                    if (continueORbreak.equals("Y", ignoreCase = true))
//                    {
//                        continue@ProccesProgram
//                    }
//                    else{
//                        break@ProccesProgram
//                    }
//                }
//
//            }
//            else
//            {
//                println("Program Berhenti..")
//                break@ProccesProgram
//            }
//        }

}