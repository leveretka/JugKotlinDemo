package demo

val sumOfTwo = { x: Int, y: Int -> x + y }
val mulOfTwo = { x: Int, y: Int -> x * y }

fun calcSum(list: List<Int>, sum: (x: Int, y: Int) -> Int) = list.reduce(sum)

fun main(args: Array<String>) {
    println(calcSum((1..15).toList(), sumOfTwo))
    println(calcSum((1..15).toList(), mulOfTwo))

    Thread {
        for (i in 1..100)
            println(i)
    }.start()

//    MyThread { ->
//        for (i in 1..100)
//            print(i)
//    }.start()

    Thread.sleep(2000)
}

class MyThread(val r: Runnable) {
    fun start() = Thread(r).start()
}
