package coroutines

import kotlinx.coroutines.*


fun main() = runBlocking  {//where suspend functions are run
    //Executes in main thread
    println("Main program starts: ${Thread.currentThread().name}")

    // Executes in background thread(Worker thread)
    GlobalScope.launch{
        println("Fake work starts: ${Thread.currentThread().name}")
        delay(1000)
        println("Fake work ends: ${Thread.currentThread().name}")
    }

    delay(2000)

    //Executes in main thread
    println("Main program ends:${Thread.currentThread().name}")

}

