package com.OOP.DataUser


import java.util.*

fun main ()
{
    var reader = Scanner(System.`in`)
    print("Masukkan Username: ") ; var userName : String = reader.nextLine()
    print("Masukkan Password nya: ") ; var password : String = reader.nextLine()

    DataUser(userName, password)

    var getData = ShowData_User(userName, password)
    getData.showData()
}

//  Program view data pribadi
//  ID = Bagas, Pass = 123Bagas