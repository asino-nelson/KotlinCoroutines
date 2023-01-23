package coroutines.coroutineBuilders

import kotlinx.coroutines.*


fun main() = runBlocking  {

    println("Main program starts: ${Thread.currentThread().name}")

    val def : Deferred<Unit> = async{
        println("Fake work starts: ${Thread.currentThread().name}")
        delay(1000)
        println("Fake work ends: ${Thread.currentThread().name}")
    }

    def.await()

    println("Main program ends:${Thread.currentThread().name}")

}