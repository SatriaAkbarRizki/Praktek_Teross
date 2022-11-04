package com.OOP.AsalDaerah

open class IdentitiasPeople (name : String, region : String) {
    var name = name
    var region = region

    open fun ShowIndentitas()
    {
        println ("Identitas Siswa")
        println("Nama Saya: $name")
        println("Daerah Asal: $region")
    }
}

class  identitasPeople2 (var _name: String, var _region: String, var _GuruStudi : String) /* Class child dengan penambahan contructor*/ : IdentitiasPeople (_name, _region) /* Contstructor dari class Parrent */{
    // Pewarisan dari IdentitasPeople dengan Penambahahan COnstructor

    override fun ShowIndentitas()
    {
        println ("Identitas Guru")
        println ("Nama Guru: $_name")
        println ("Daerah Asal: $_region")
        println ("Guru Studi: $_GuruStudi")
    }

}
//  Program dengan menggunakan OOP
//  Pakai COntructor juga