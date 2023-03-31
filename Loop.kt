fun main() {
    val rgx = Regex("([a-hA-H][1-8]){2}")
    println("Pawns-Only Chess")
    println("First Player's name:")
    val p1 = readln()
    println("Second Player's name:")
    val p2 = readln()
    println("""
  +---+---+---+---+---+---+---+---+
8 |   |   |   |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+
7 | B | B | B | B | B | B | B | B |
  +---+---+---+---+---+---+---+---+
6 |   |   |   |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+
5 |   |   |   |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+
4 |   |   |   |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+
3 |   |   |   |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+
2 | W | W | W | W | W | W | W | W |
  +---+---+---+---+---+---+---+---+
1 |   |   |   |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+
    a   b   c   d   e   f   g   h
    """.trimIndent())
    kloop@while(true) {
        loop@ while(true) {
            println("$p1's turn:")
            val p3 = readln()
            if (p3 == "exit") {
                println("Bye!"); break@kloop
            } else if (!p3.matches(rgx)) {
                println("Invalid Input"); continue@loop
            } else break
        }
        cloop@while (true) {
            println("$p2's turn:")
            val p4 = readln()
            if (p4 == "exit") {
                println("Bye!"); break@kloop
            } else if (!p4.matches(rgx)) {
                println("Invalid Input"); continue@cloop
            } else break
        }
    }
}