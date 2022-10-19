package com.OOP.NamaKawan

fun main()
{
    infix fun String.EjekDia( Sebutan : String) : String{
        return "Kamu " + this + Sebutan
    }

    infix fun String.PujiDia( Sebutan : String) : String{
        return  "Kamu " + this + Sebutan
    }

//  Extension Dari main
    val nama = "Agus"
    println (nama EjekDia " Jelek")              // Gak perlu pakai dot lagi dia
    println (nama PujiDia " Ganteng")

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


//  Kalau bisa pakai infix untuk extension function yang memiliki 1 parameter agar mudah dibaca