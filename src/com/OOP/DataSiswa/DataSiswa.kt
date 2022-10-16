package com.OOP.DataSiswa

enum class DataSiswa (val namaGuru : String, val kelas : String) {
    KELAS_XII_TKJ("Puspa Sari", "XII_TKJ" ),

    KELAS_XII_RPL("Diawan", "XII_RPL");

    companion object DaftarSiswa
    {
        fun ShowData_SiswaTKJ()
        {
            val listSiswa = arrayOf("Arridha", "Ayub Azani", "M.Yasir")
            for (x in listSiswa)
            {
                println(x)
            }
        }

        fun ShowData_SiswaRPL()
        {
            val listSiswa = arrayOf("Aldi", "Albi", "Gabeng")
            for (x in listSiswa)
            {
                println(x)
            }
        }
    }
}