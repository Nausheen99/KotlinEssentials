fun main() {
    ifVariants()
}

fun ifVariants(){

    //if statement
    val a = 5
    val b = 10
    val c = 7
    var min = 0
    if (a<b){
        println("$a<$b")
    }else
    {
        println("$a>$b")
    }

    //if expression
    //equivalentto a > b ? a : b
    val max = if (a<b) a else b
    println(max)

    //nested if
    if (a<b){
        if(a<c){
            min = a
        }
    }
    println(min)
}