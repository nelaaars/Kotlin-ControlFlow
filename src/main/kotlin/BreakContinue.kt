/*fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt) {
        if (i == null) continue
        print(i)
        }
    }*/

fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }
}