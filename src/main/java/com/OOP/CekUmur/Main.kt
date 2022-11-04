package com.OOP.CekUmur

import java.util.Scanner


class CekUmur(var Umur : Int)
{
    init {
        if (Umur <= 18)
        {
            println("Kamu Belum Dewasa")
        }
        else
        {
            println("Kamu Udah Dewasa, Fokuslah dengan Masa Depan Jangan Banyak Main")
        }
    }
}


fun main()
{
    var reader = Scanner(System.`in`)
    print ("Masukkan Umur kamu: ") ; var umur = reader.nextInt()
    var cekUmur = CekUmur(umur)
}

//  Program Cek Status Umur
//  Pake Constructor ama Init
//  Init adalah sebuah kode yang akan pertama kali di exekusi setelah class di instantiated (DIpanggil atau dibuat
//  Init di exekusi pertama kali baru sesudah nya function" yang lain di exekusi di dalam blok class