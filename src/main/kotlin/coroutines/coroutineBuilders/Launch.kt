package coroutines.coroutineBuilders

import kotlinx.coroutines.*

 //   *launch

fun main() = runBlocking  {

    println("Main program starts: ${Thread.currentThread().name}")

    val job :Job = launch{
        println("Fake work starts: ${Thread.currentThread().name}")
        delay(1000)
        println("Fake work ends: ${Thread.currentThread().name}")
    }

    job.join()

    println("Main program ends:${Thread.currentThread().name}")

}