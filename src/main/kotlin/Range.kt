fun main () {
    val rangeInt = 10..100 step 10
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
}