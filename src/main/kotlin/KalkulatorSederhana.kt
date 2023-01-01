package org.kalkulator

public fun OperasiMatematika() {
    print("Masukkan angka pertama : ")
    val num1 = readln()!!.toLong()
    print("Masukkan angka kedua : ")
    val num2 = readln()!!.toLong()
    print("masukkan jenis operator(+, -, *, /) : ")
    val operator = readln()
    var result =
    when(operator){
        "+" ->  num1 + num2
        "-" ->  num1 - num2
        "*" ->  num1 * num2
        "/" ->  num1 / num2
        else -> println("operator tidak valid")
    }
    println("Hasil dari $num1 $operator $num2 = $result")
}

public fun inginBayar(){
    print("Ingin Bayar Langsung? :")
    val opsi = readln()
    when{

    }
}