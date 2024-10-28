fun main () {
    val artists = arrayOf("Beyonce", "Rihanna", "Alicia", "Brittney")
    println("Artists in the array: ")
    for (curArtist in artists) {
        println(curArtist)
    }
    println("Please enter an artist: ")
    var sArtist = readLine() ?: ""
    var msg = if (sArtist in artists) "correct" else "incorrect"
    println("$sArtist is $msg")

    while (sArtist !in artists) {

        println("Please enter an artist: ")
        sArtist = readLine() ?: ""
        msg = if (sArtist in artists) "correct" else "incorrect"
        println("$sArtist is $msg")
    }
}