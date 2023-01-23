package coroutines

import kotlinx.coroutines.*

fun main() = runBlocking  {

    println("Main program starts: ${Thread.currentThread().name}")

    val job : Job = launch{
        for (i in 1..100) {
            print("$i ")
            delay(10)
        }

    }

    delay(200)
    job.cancelAndJoin()

    println("\n Main program ends:${Thread.currentThread().name}")

}

