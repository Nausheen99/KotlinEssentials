package tasks

fun main() {
    println("Please enter string and preferred style (upper,lowe,snake,camel")
    val str = readLine()
    val style = readLine()

    println(consistency(str!!, style!!))
}

fun consistency(str:String, style: String):String{
    var temp = str
    //var t = ' '
    var index = arrayListOf<Int>()
    if (style.lowercase() == "upper"){
        temp = str.uppercase()
    }
    else if (style.lowercase() == "lower"){
        temp = str.lowercase()
    }
    else if (style.lowercase() == "snake")
    {
        temp = str.replace(" ", "_")
    }
    else if(style.lowercase() == "camel"){
        for (element in str.indices){
            //var inn = str.indexOf(' ')
            if (str[element] == ' ')
            index.add(element)
        }
        for (e in index.indices) {

            temp = temp.replace(" ${temp[index[e]+1]}", str[index[e]+1].uppercase())
        }
    }
    println(index)
    return temp

}


//upper -> all caps
//lower -> all small
