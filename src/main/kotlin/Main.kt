
import org.belajar.HitungUmur
import org.belajar.PilihCanang
import org.belajar.name
import org.belajar.outputName
import org.kalkulator.OperasiMatematika
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val time = LocalDateTime.now()
    print("masukkan nama :\t")
    name
    outputName
    print("""
        ingin melakukan apa?
        | 1. hitung umur
        | 2. pembelian
        | 3. kalkulator
        |silahkan pilih :
    """.trimIndent())
    val opsi = readln().toInt()
    when(opsi) {
         1 ->  HitungUmur()
         2 ->  PilihCanang()
         3 ->  OperasiMatematika()
    }
}