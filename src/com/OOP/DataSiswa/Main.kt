package com.OOP.DataSiswa

fun main()
{
    println("Wali Kelas : ${DataSiswa.KELAS_XII_TKJ.namaGuru} \n" +
            "Kelas: ${DataSiswa.KELAS_XII_TKJ.kelas}")
    println (DataSiswa.ShowData_SiswaTKJ())

    println("\nWali Kelas: ${DataSiswa.KELAS_XII_RPL.namaGuru} \n" +
            "Kelas: ${DataSiswa.KELAS_XII_TKJ.kelas}")
    println(DataSiswa.ShowData_SiswaRPL())
}

//  Program Data Siswa di kelas
//  Pakai Enum + comppanion objek
//  Enum adalh kempulan variable tanpa harus di deklrasi dengan telah ditentukan dari constructor
//  Companion Objek adalah sebauh deklarsi objek di dalam class, simple seperti static di Java
//  Kalau mau akses tanpa deklarsi objek ya.. pakai static, di kotlin pakai companio objek dia.
