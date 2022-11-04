package com.OOP.DataUser_Optimize


open class DataUser ( var username : String, var password : String){
    private var CheckUsername = "Bagas"
    private var CheckPassword = "123Bagas"

    inner class ShowData_User (username: String, password: String) : DataUser(username, password)
    {
        private var namaLengkap = "Bagas Santoso"
        private var tanggallLahir = "13/08/1996"
        private var alamatRumah = "Blang Pase"

        fun showData()
        {
            if (username.equals(CheckUsername) && password.equals(CheckPassword))
            {
                println ("Data Bagas")
                print ("Nama: $namaLengkap " +
                        "\nTanggal Lahir: $tanggallLahir " +
                        "\nAlamat Rumah : $alamatRumah \n")
            }
            else{
                println ("Maaf Username dan Password salah")
            }
        }
    }
}

