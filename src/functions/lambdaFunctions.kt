package functions

fun main() {

    val funlit = { number : Int -> println("I am lambda $number") }

    //inferred function type
    val sum = {x:Int,y:Int -> x+y}

    //explicit function type
    val summ: (Int,Int) -> Int = {x,y -> x+y}

    val fn = {a:Int,b:Int -> a*b}

    //function that takes function as an argument
    fun complex(c:Int, fnc: (a:Int,b:Int)->Int):Int{
        val d = c + fnc(5,5)
        return d
    }

    complex(5, fn)
    //without annotation, works only in higher order
    //val sum = {x,y -> x+y}

    funlit(7)
    //anonymous function
    //fun(x:Int,y:Int) : Int = x+y

    //calling lambdas different ways:
    val people = listOf(Person("Nausheen", 22), Person("Tayyaba", 23))

    //basic
    println(people.maxByOrNull ({p:Person -> p.age }))

    //since only one / last argument, can be shifted out of parenthesis
    println(people.maxByOrNull() { p:Person -> p.age })

    //when single argument, () can be removed as well
    println(people.maxByOrNull { p:Person -> p.age })

    // inference
    println(people.maxByOrNull { p -> p.age })

    println(people.maxByOrNull { it.age })

        /*
        //creating anon class for creatig an instance SAM - > Single Abstract Method : Lambda -> functional interface
    fun createfunctionalinterface(): summ{
        return summ{
            println("Functional Interface Created")
        }
    }
         */

    //returning functions from functions

    fun bar(test: (String)): (String) -> String = {str -> str.reversed()}
    val reversi  = bar(test())
    println(reversi("hello"))
    println(reversi("Do you work"))
    println(reversi("cattac"))

    // inline functions: copy function and parameters to function call directly, closes function after use
    //bar(test)
}

data class Person(val name:String,var age:Int){}


inline fun test():String{
    println("Inline test")
    return ("Iwork")
}