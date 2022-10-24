package com.OOP.Perpustakaan

import java.util.*

open class Skripsi
{
    open var kategoriSkripsi: String = ""
    val JudulSkripsi = {judul : String -> judul}
    val namaPenulis = {penulis : String -> penulis}
    val namaProdi  = {prodi : String -> prodi}
    open val tahunTerbit = {tahun_terbit : String -> tahun_terbit}
    val jenisSkripsi = fun (jenis : String): String {
        kategoriSkripsi = jenis         // Inisialisasi kan ke variable kategoriSkripsi
        return jenis
    }

    val durasiPinjam = {durasi : String -> durasi}

    class Buku : Skripsi()
    {
        val judulBuku = {judul : String -> judul}
        val namaPengarang = {pengatang : String -> pengatang}
        val namaPenerbit = {penerbit : String -> penerbit}
        override val tahunTerbit: (String) -> String
            get() = super.tahunTerbit
        val jumlahBuku = {jumlah : String -> jumlah}
    }

}


fun main()
{
    var setSkripsi = Skripsi()
    var setBuku = Skripsi.Buku()
    var setCategory_Book = setSkripsi

    val input = Scanner(System.`in`)

    println("Judul Skripsi\t:\t" + setSkripsi.JudulSkripsi("Kehidupan Sosial Remaja"));
    println("Nama Penulis\t:\t" + setSkripsi.namaPenulis("Budi Sangianto"))
    println("Nama Prodi\t\t:\t"+ setSkripsi.namaProdi("Sosiologi"))
    println("Tahun Terbit\t:\t" + setSkripsi.tahunTerbit("Semester Ganjil 2018/2019"))
    println("Jenis Skripsi\t:\t" + setSkripsi.jenisSkripsi("sosial"))
    println("Durasi Pinjam\t:\t" + setSkripsi.durasiPinjam("20 Hari"))
    println("Kategori Skripsi:\t" + setSkripsi.kategoriSkripsi)

    println("\nJudul Buku\t\t:\t" + setBuku.judulBuku("The Presentation of Self in Everyday Life"))
    println("Nama Pengarang\t:\t" + setBuku.namaPengarang("Erving Goffman"))
    println("Tahun Terbit\t:\t" + setBuku.tahunTerbit("1956"))
    println("Nama Penerbit\t:\t" + setBuku.namaPenerbit("TIdak Ada"))
    println("Kategori Buku\t:\t" + setCategory_Book.kategoriSkripsi)
    println("Jumlah Buku\t\t:\t" + setBuku.jumlahBuku("10"))

}
