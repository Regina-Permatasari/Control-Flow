fun main() {
    val listOfInt = listOf(1, null, 3, null, 5, null, 7, null, 9, null)

    for (i in listOfInt) {
        if (i == null) continue
        print (i)
    }
}