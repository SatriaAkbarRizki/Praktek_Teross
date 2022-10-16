package com.DeteksiNomorNegara

import java.util.Scanner


fun SearchRegion(number : String) : Int // Pakai method return Int
{
    var RegionNumber : HashMap <Int, String> = HashMap <Int, String>()
    RegionNumber.put(1,"Amerika Serikat")
    RegionNumber.put(27, "Afrika Selatan")
    RegionNumber.put(32, "Belgia")
    RegionNumber.put(54, "Argentina")
    RegionNumber.put(62,"Indonesia")


    for (key in 0..100)
    {
        var lengthKey = key.toString()      // AMbil Panjang number untuk dijadikan batas index
        var subStringNumber = number.subSequence(startIndex = 0, endIndex = lengthKey.length).toString()    // Disorted sesuai key
        if (RegionNumber.get(subStringNumber.toInt()) != null)
        {
            println ("Nomor Anda: $number" +
                    "\nNomor tersebut berasal dari negara: ${RegionNumber.get(subStringNumber.toInt())}")
            break
        }
        else
        {
            println ("Maaf nomor negara tersebut tidak ada")
            break
        }
    }
    return number.toInt()

}


fun main(args: Array<String>)
{
    var reader = Scanner(System.`in`)
    print ("Masukkan Nomor nya: ")
    var InputNomor = reader.nextLine()
    SearchRegion(InputNomor)
}

// Program Mendeteksi Nomor Negara