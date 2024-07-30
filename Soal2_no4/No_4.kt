fun main() {
    val rows = 6 // Jumlah baris pola segitiga

    for (i in rows downTo 1) {
        // Mencetak spasi untuk mengatur agar segitiga rata kanan
        for (space in 1..(rows - i)) {
            print(" ")
        }
        // Mencetak angka
        for (num in 1..i) {
            print("*")
        }
        println()
    }

    for (i in 1..rows) {
        // Mencetak spasi untuk mengatur agar segitiga rata kanan
        for (space in rows downTo i + 1) {
            print(" ")
        }
        // Mencetak angka
        for (num in 1..i) {
            print("*")
        }
        println()
    }
}