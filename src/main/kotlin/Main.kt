
import org.belajar.HitungUmur
import org.belajar.MenuLogin
import org.belajar.PilihCanang
import org.kalkulator.OperasiMatematika
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val time = LocalDateTime.now()
    while(true){
        MenuLogin()
        println("login terlebih dahulu\n")
        print(
            """
        ingin melakukan apa?
        | 1. hitung umur
        | 2. pembelian
        | 3. kalkulator
        |silahkan pilih :
    """.trimIndent()
        )
        val opsi = readln().toInt()
        when (opsi) {
            1 -> HitungUmur()
            2 -> PilihCanang()
            3 -> OperasiMatematika()
            else -> {
                print("Opsi Belum Tersedia ingin mengulang? (Y/N)")
                val jawaban = readln()
                when (jawaban) {
                    "y", "Y", "Ya", "YA" -> continue
                    else -> break
                }
            }
        }
    }
}