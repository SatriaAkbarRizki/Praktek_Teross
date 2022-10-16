package com.OOP.DataUser_Optimize


import java.util.*

fun main ()
{
    var reader = Scanner(System.`in`)
    print("Masukkan Username: ") ; var userName : String = reader.nextLine()
    print("Masukkan Password nya: ") ; var password : String = reader.nextLine()

    DataUser(userName, password)

    DataUser(userName, password).ShowData_User(userName, password).showData()
}

//  Program view data pribadi dengan code yang optimize
//  ID = Bagas, Pass = 123Bagas
//  Optimize code pakai nested and inner
//  Nested adalah class yang didalam nya ada class lagi
//  Inner adalah keyword yang bisa mengakses class bersarang / class diatas dari class dibawah
//  Inner dipakai variable bersifat protected
