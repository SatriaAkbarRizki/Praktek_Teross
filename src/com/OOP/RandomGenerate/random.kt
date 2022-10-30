package com.OOP.RandomGenerate

import java.util.*

fun main()
{
    val password : (String) -> String = {it}
    var generatePassword : (String) -> Unit = {                 /* lambda dengan titik koma */
        pass -> for (x in 0 until pass.length)           /*pass adalah variable parameter nya*/
        {
            var passRandom = pass.random()
            print (passRandom)
        }
    }

    fun loginUser(username : String, passwordUser : String) : Unit
    {
        println("Username: " + username)
        println("Passsword: " + passwordUser)
        generatePassword(passwordUser); println()
    }

    val input = Scanner(System.`in`)
    print ("Masukkan Username anda: "); val usernameInput = input.nextLine()
    print ("Masukkan Passowd Anda: "); val passwordInput = input.nextLine()


    loginUser(usernameInput,passwordInput)

}

/*  Program random password
*   Berisi dengan lambda
*
*   kalau mau pakai = (sama dengan) maka syntax lamda nya lebih pendek (tidak detail )
*   sedangkan dengan menggunakan : (titik 2) maka snytax lambda nya lebih detail
*   Example
*   Lambda (titik 2)         val sum : (tipe data nilai) -> tipe return nya = {Operation Code}
    Labda (sama dengan)      val sum = {variable : tipe data nya -> Operation Code}
*
*
 */
