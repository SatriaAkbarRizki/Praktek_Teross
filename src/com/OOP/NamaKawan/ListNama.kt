package com.OOP.NamaKawan

class GudangPanggilan(var namaDia : String) {

}


// Extension Function
fun GudangPanggilan.SebutanBiasa () : String
{
    return "Kamu " + namaDia + " Batak"
}

fun GudangPanggilan.SebutanMedium() : String
{
    return "Lo " + namaDia + " Sok Asik"
}

fun GudangPanggilan.SebutanHard() : String{
    return "Woi " + "BAGAS" + " Sok Asik Lo"
}
