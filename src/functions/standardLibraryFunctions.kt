//with, let, apply, also, run, lazy, use

fun main() {
    var test = Scopefunctions()
    println(test.testlet)
    println(test.testalso())

    test.apply{
        i = 10 }
    println(test.testalso())

    val me = Person("Nausheen", 22)
    // apply
    me.apply{
        this.name = "Nousheen Abbas"
        var pet = "Maizy"
    }
    println(me)
    //println(me.pet)  ???

    //with
    with(me){
        name = "Naush"
        age = 23
    }
    println(me)

    //me.name = "Nausheen Abbas"

    //run
    me.run{
        this.name = "Nausheen Abbas"
    }
    println(me)

    //lazy ???????
    var you = lazy {Person("not known",0)}

    //use


    //repeat
    var a = 2
    repeat(5,{++a})
    print(a)

}

class Scopefunctions{
    var number: Int? = null
    var i = 5
    //let implementation
        var testlet = number?.let {
            it * it
        } ?: 5

    //also
    fun testalso() = (++i).also {i*i}

}

data class Person(var name:String, var age:Int){}