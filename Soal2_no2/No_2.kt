fun gantiHuruf(kata: String): String {
    return kata.replace('o', 'a')
}

fun main() {
    val kataAsli = "Purwokerto"
    val kataBaru = gantiHuruf(kataAsli)

    println("kata sebelumnya : $kataAsli")
    println("kata setelahnya : $kataBaru")
}