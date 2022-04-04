import java.io.BufferedReader
import java.io.StringReader

//try, catch and finally

fun readd(reader: BufferedReader) : Int?{
    try{
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch(e: java.lang.NumberFormatException){
        return null
    }
    finally {
        reader.close()
    }
}

fun main() {
    val reader = BufferedReader(StringReader("239 work" ))
    println(readd(reader))
}