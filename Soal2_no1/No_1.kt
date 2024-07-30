fun main() {
    val nilaiBahasaIndonesia: Double
    val nilaiBahasaInggris: Double
    val nilaiMatematika: Double
    val nilaiIpa : Double

    try {
        print("masukan nilai Bhasa Indonesia")
        nilaiBahasaIndonesia = readLine()?.toDouble() ?: throw IllegalArgumentException("Nnilai tidak boleh kosong")
        print("masukan nilai Bahasa Inggris")
        nilaiBahasaInggris = readLine()?.toDouble() ?: throw IllegalArgumentException("Nilai tidak boleh kosong")
        print("masukan nilai Matematika")
        nilaiMatematika = readLine()?.toDouble() ?: throw IllegalArgumentException("Nilai tidak boleh kosong")
        print("masukan nialai Ipa")
        nilaiIpa = readLine()?.toDouble() ?: throw IllegalArgumentException("Nilai tidak boleh kosong")

        // Nilai tidak boleh negatif
        if (nilaiBahasaIndonesia < 0 || nilaiBahasaInggris < 0 || nilaiMatematika < 0 || nilaiIpa < 0 ){
            throw  IllegalArgumentException("NIlai tidak boleh negatif ")
        }

        // rata rata nilai
        val rataRata = (nilaiBahasaIndonesia + nilaiBahasaInggris + nilaiMatematika + nilaiIpa)/ 4

        // grade nilai
        val grade = when {
            rataRata >= 90 -> "A"
            rataRata >= 80 -> "B"
            rataRata >= 70 -> "C"
            rataRata >= 60 -> "D"
            else -> "E"
        }

        // menampilkan hasil
        println("Rata-rata nilai: %.2f".format(rataRata))
        println("Grade: $grade")

    }catch (e: IllegalArgumentException){
        println("Error: ${e.message}")
        println("Masukkan nilai yang valid.")
    }catch (e: NumberFormatException){
        println("Error: Masukkan angka yang valid.")
    }
}