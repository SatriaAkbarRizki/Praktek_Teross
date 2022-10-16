package com.OOP.NamaKawan

fun main()
{
    fun String.EjekDia( Sebtan : String) : String{
        return "Kamu " + this + Sebtan
    }

    fun String.PujiDia( Sebutan : String) : String{
        return  "Kamu " + this + Sebutan
    }

//  Extension Dari main
    val nama = "Agus"
    println (nama.EjekDia(" Jelek"))
    println (nama.PujiDia(" Pintar"))

//    Extension Dari Class
    val panggil = GudangPanggilan(nama)
    println(panggil.SebutanBiasa())
    println(panggil.SebutanMedium())
    println(panggil.SebutanHard())

}

//  Program dengan penambahan fungsi
//  Pakai Extension Function
//  Extension Function adalah Penambahan Fungsi sesuai yang kita mau, dan untuk membuat fungsi tanpa harus du class
//  Ini biasanya dipakai untuk tidak langsung menyentuh dengan class asli


/* "Kamu" + this (didapat dari val yang dipanggil) + Sebutan (didapat dari parameter function)  */