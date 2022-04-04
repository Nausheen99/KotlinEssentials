package tasks

fun main() {

    encode("ab cd", 1)
}

fun encode(str:String, key:Int){
    val temp = str.lowercase()
    var char = arrayListOf<Int>()
    for (e in temp.indices) {
        char.add(temp[e].code)

        if (char[e] in 97..122){
            char[e] = (char[e] + key)
        }
    }


    //var final = char.
    //println(final)
        //println(char)


}
