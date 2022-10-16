package com.OOP.AsalDaerah

import java.util.Scanner

fun main(args : Array<String>)
{
    var input = Scanner(System.`in`)
    println("Isi Identitas SIswa")
    print ("Nama: ") ; var name = input.nextLine()
    print ("Asal Daerah: ") ; var AsalDaerah = input.nextLine()

    var identittasSiswa = IdentitiasPeople(name, AsalDaerah)


    print("\nIsi Identitas Guru")
    print ("\nNama Guru: ") ; var _name = input.nextLine()
    print ("Asal Daerah: ") ; var _AsalDaerah = input.nextLine()
    print ("Guru Studi: ") ; var _guruStudi = input.nextLine()
    var identitiasGuru = identitasPeople2(_name, _AsalDaerah , _guruStudi)

    println()
    identittasSiswa.ShowIndentitas()
    println()
    identitiasGuru.ShowIndentitas()
}

// Program dengan OOP menggunakan Inherintace, Constructor, Overriding