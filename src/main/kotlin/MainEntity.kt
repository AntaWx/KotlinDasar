package org.belajar

import java.io.IOException
import java.time.LocalDateTime

public val name = readln();
public val outputName = println("Hello $name")
public val bornYear = readln()
public val nowYear = readln()
public val time = LocalDateTime.now()

public fun HitungUmur(){
    clearScreen()
    print("\n Masukkan tahun kelahiran : ")
    val bornYear = readln()
    print("masukkan tahun sekarang : ")
    val nowYear = readln()
    println("umur kamu sekarang adalah ${nowYear.toInt() - bornYear.toInt()}")
    clearScreen()
}

fun PilihCanang(){
    clearScreen()
    val jenis = """
        
        |tersedia :
        | 1. canang sari
        | 2. canang ceper
        | 3. sampian
        |masukkan pilihan : 
    """.trimIndent()
    print("\n|mau pesan apa? $jenis")
    val opsi = readln().toInt()
    when{
        opsi == 1 -> return HitungCanang(7000)
        opsi == 2 -> return HitungCanang(8000)
        opsi == 3 -> return HitungCanang(5000)
    }
    clearScreen()
}

public fun HitungCanang(harga: Int? ) {
    print(
        """
        |pilihan jumlah canang :
        | 1. 25
        | 2. 50
        | 3. 75
        | 4. 100
        |masukkan jumlah : 
    """.trimIndent()
    )
    var jumlahDefault = 25
    val jumlahInput = readln()
    when (jumlahInput.toInt()) {
        1 -> print(
            """
              |jumlah pesanan : $jumlahDefault
              |total harga : $harga
          """.trimIndent()
        )

        2 -> print(
            """
              |jumlah pesanan : ${jumlahDefault * 2}
              |total harga : ${harga!! * 2}
          """.trimIndent()
        )

        3 -> print(
            """
              |jumlah pesanan : ${jumlahDefault * 3}
              |total harga : ${harga!! * 3}
          """.trimIndent()
        )

        4 -> print(
            """
              |jumlah pesanan : ${jumlahDefault * 4}
              |total harga : ${harga!! * 4}
         """.trimIndent()
        )

        else -> print("Pembelian gagal karena jumlah canang belum tersedia $time")
    }
    while (true) {
        clearScreen()
        print("\n|masukkan uang anda : ")
        val uangAnda = readln().toInt();
        val sisaUang = uangAnda - harga!! * jumlahInput.toInt()
        if (uangAnda >= harga!!) {
            print("|sisa uang anda = $sisaUang")
            if (sisaUang >= 0){
                break
            }else if (harga > sisaUang) {
                clearScreen()
                print("\n|uang anda tidak cukup ingin mengulang? :")
                val ulang = readln()
                if (ulang == "y") {
                    continue
                } else {
                    break
                }
            }
        }
    }
}

fun clearScreen() {
    try {
        val process = ProcessBuilder("cmd", "/c", "cls").inheritIO().start()
        process.waitFor()
    } catch (e: IOException) {
        e.printStackTrace()
    } catch (e: InterruptedException) {
        e.printStackTrace()
    }
}
