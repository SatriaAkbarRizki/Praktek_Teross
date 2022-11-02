package com.FilterSearch

import java.util.Scanner


fun FilterSearch(filter : String)
{
    var search = arrayOf("Buku", "Penghapus", "Pulpen", "Pensil", "Kertas")


    for (x in search.indices)
    {
        var viewSearch = search[x]

        if (viewSearch.contains(filter) == null)
        {
            println("Maaf Pencarian Tersebut tidak ada")
            break
        }
        else if (viewSearch.contains(filter))
        {
            println("Anda Mencari: $viewSearch")
            continue
        }
    }

}


fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    print("Apa yang ingin kamu cari?:  ")
    val inputSearch = reader.nextLine()
    FilterSearch(inputSearch)
}
//  Program untuk cari sesuai kalimat atau karakter