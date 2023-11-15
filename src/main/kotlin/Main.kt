import kotlinx.coroutines.*

fun main() = runBlocking {
    val job1 = launch { soundAlarm("click", 5) }
    val job2 = launch { soundAlarm("chick", 7) }
    val job3 = launch { soundAlarm("tick", 10) }

    job1.join()
    job2.join()
    job3.join()
}

suspend fun soundAlarm(sound: String, seconds: Int) {
    repeat(seconds) {
        print("$sound ")
        delay(1000)
    }
    println("= BOOM")
}
