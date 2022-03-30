package controlflow

fun main() {
    //testwhenisin()
    //whentest()

    /*cases(1)
    cases("Hello")
    cases(notstring ())
    */

}
class notstring {}
fun testwhenisin(){
    val names = listOf("John", "Sarah", "Tim", "Maggie")
    val n:String = "Tim"
    when (n){
        is String -> println(n.length)
        in names -> println("Name is in list")

    }
}
fun whentest(){
    println("Enter name of character")
    var x = readLine()
    //val x = "Naruto"
    //when against constants
    val attack = when (x){
        "Naruto" -> println("Rasingan")
        "Sasuke","Itachi" -> println("Sharingan")
        "Niji" -> println("Byakugan")
        "Kakashi" -> println("Thousand years of pain")
        else -> println("Basic shurikens")
    }

    println("Enter number")
    var y = readLine()?.toInt()

    //when with in
    when (y){
        in 0..9 -> println("Lies in 0..9")
        in 10..19 -> println("Lies in 10..19")
        in 20..49 -> println("Lies in 20..49")
        else -> println("Out of range")

    }

    //when with smart cast
    fun testingwhen(any: Any): Boolean{
        return when (any){
            is String -> any.startsWith("Oh")
            else -> false
        }
    }
}


fun cases(obj: Any){
    when (obj){
        1 -> println("one")
        "Hello" -> println("Greetme")
        is Long -> println("islong")
        !is String -> println("notstring")
        else -> println("Unknown")

    }
}
