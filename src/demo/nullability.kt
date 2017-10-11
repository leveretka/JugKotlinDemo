package demo

fun main(args: Array<String>) {
    val string1: String = "abc"
    val string2: String? = null

    printStringLength(string1, string2)
}

fun printStringLength(string1: String, string2: String?) {

    println(string1.length)

    println(string2?.length)

    println(string2?.length ?: -1)

    println(string2!!.length)
}
