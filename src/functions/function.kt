package functions

fun main() {

    //directly calling function
    test("batman","huihuihui")

    //calling function in a var
    val statement = foo(16)
    foo1(4)
    foo2(2)


    val c1 = concat1(3,5)
    val c2 = concat2(3,6)
    donothing("This is an example of unit function")
    //overloading
    println(hello())
    hello("This is hello, showing overloading", 2)
    hello(3,"for overloading")

    //named arguments
    multiply(first = 3, third=4)

    //infix
    val test = Testclass()
    //test.concat2("is infix function")
    test concat2 " an infix function"

    //varargs
    multiprint("This","is","an","example","of","varargs")
    //spread operator
    var strlist = arrayOf("with","spread","operator","*")
    multiprint(*strlist)
    println()
    //extension function receiver
    print(test.extended())
    test.add(2,3)
    test.add(2.2,3.3)
}

//single expression function
fun test(one:String, two: String) = println("Hello! I am $one $two")

//require used for parameter verification
fun foo(k:Int){require(k>10, {"k >10"})}

//assert
fun foo1(k:Int){assert(k>5, {"k >5"})}

//check
fun foo2(k:Int){check(k>1, {"k >0"})}

//both functions below do the same thing
fun concat1(a:Int, b:Int):Int{
    return a+b
}

fun concat2(a:Int,b:Int) = a+b

//unit functions: Don't return meaningful value, only unit...(look like void)
//no need to return specifically though
fun donothing(str:String): Unit{
    println(str)
}

//no parameters
fun hello():String = "Hello world with no parameters"

//member vs local functions
//arguments(in function call) vs parameters(in function definition)

//default parameters
fun multiply(first: Int = 1,second : Int = 1,third : Int = 1){
    println("Default and name parameters/arguments ${first*second*third}")
}

//infix function
class Testclass {
    var str= "This is"
    infix fun concat2(str2: String) {
        println(str + str2)
    }
    fun add(a:Int, b:Int){
        println("Member function to add Ints ${a+b}")
    }
}

//var args
fun multiprint(vararg strings:String){
    for (string in strings)
        print("$string ")
}

//overloading
fun hello(str:String, num: Int){
    println(str + num)
}

fun hello(num: Int, str: String){
    println("This is hello $num $str")
}

//extension functions
fun Testclass.extended(){
    print("This is an example of extension function")
}

fun Testclass.add(a:Double, b:Double){
    println("Extended function to add Doubles ${a+b} hence, overloading")
}