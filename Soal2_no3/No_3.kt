fun plugin(number: Int) {
    for (i in 1..number) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("plugin")
            i % 3 == 0 -> println("plug")
            i % 5 == 0 -> println("in")
            else -> println(i)
        }
    }
}

fun main() {
    println("plugin(5)")
    plugin(5)
}