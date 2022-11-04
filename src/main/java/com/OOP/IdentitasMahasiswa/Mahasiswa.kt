package com.OOP.IdentitasMahasiswa

import com.OOP.IdentitasMahasiswa.DataMahasiswa.Extension.converteString
import java.util.*

fun String.SetTahun () : String                 // Extension Function
{
    var Number = this.toString()
    return "20${Number.subSequence(0,2)}"
}

fun String.SetGelar() : String
{
    var convertToInt = this.toString().subSequence(4,5).converteString()
    var gelar = ""
    when (convertToInt)
    {
        1 ->  gelar = "S1"
        2 ->  gelar = "D3"
        3 ->  gelar = "D4"
        else -> gelar = "false"
    }
    return gelar
}


fun main()
{
    val input = Scanner(System.`in`)
    print ("Masukkan NIM: ") ; val NIM = input.nextLine()
    try {
        if (NIM.length > 8)
        {
            println("Maaf Itu Bukan NIM")
        }
        else
        {
            val mahasiswa = DataMahasiswa()

            val TahunMHS = NIM.SetTahun()
            val JurusanMHS = mahasiswa.SetNumber_Jurusan(NIM)
            val GelarMHS = NIM.SetGelar()

            println("NIM" + "\t\t\tTahun\t" + "\tJurusan\t" + "\t\t\t\t\tGelar")
            println(NIM + "\t\t$TahunMHS\t" + "\t$JurusanMHS " + "\t\t$GelarMHS")
        }
    }catch (e : Exception)
    {
        println ("Mohon Masukkan NIM yang lengkap")
    }
}

//  Program lihat data Mahasiswa dengan Nomor NIM
//  Program ini pakai sekumpulan dari dari estension function, subSequence dan companion objeck

