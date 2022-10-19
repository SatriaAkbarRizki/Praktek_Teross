package com.OOP.IdentitasMahasiswa

class DataMahasiswa() {
    val Jurusan = mapOf( 1 to "Teknik Sipil", 2 to "Teknik Mesin", 3 to "Teknik Elektro",
                        4 to "Teknik Material", 5 to "Teknik Geodesi", 6 to "Teknik Informatika")

    fun SetNumber_Jurusan (Number : String) : String
    {
        var setNumber_Jurusan = Number.subSequence(3,4)
        val setInt_Number = setNumber_Jurusan.converteString()
        var JurusanDia = ""
        for ((k, v) in Jurusan)             /* K == Key, dan V == Value */
        {
            if (k.equals(setInt_Number))
            {
                JurusanDia = v
                break
            }
            else if (k > setInt_Number)
            {
                JurusanDia = "false"

            }
        }
        return JurusanDia
    }


    companion object Extension              // Pakai companion objek kalau tidak mau buat objek lagi di main
    {
        fun CharSequence.converteString() : Int
        {
            return this.toString().toInt()
        }
    }

}

