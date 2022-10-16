package com.CalculateMedali

import java.util.Arrays
import javax.naming.directory.SearchControls
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.Equals

fun SearchSum (getElement : Array <String> )
{
    var sumEmas = 0
    var sumPerak = 0
    for (item in getElement.indices)
    {
        if (getElement[item].contains("Emas"))
        {
            sumEmas++
        }
        else
        {
            sumPerak++
        }
    }
    println("Jumlah Medali Emas adalah: " + sumEmas)
    println("Jumlah Medali Perak adalah: " + sumPerak)

}

fun main (Args: Array<String>)
{
    val medal = arrayOf <String> ("Emas","Perak","Emas",
                                    "Perak", "Emas","Perak"
                                    ,"Emas")

    SearchSum(medal.toList().toTypedArray())        // Konversi ke type array
}
