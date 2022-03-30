package functions

fun main() {

    var one = coordinates(1,1,1)
    var two = coordinates(2,2,2)
    var three = one + two
    println(three)
    one += coordinates(5,5,5)
    println(three)
    println(two==three)
    println(-three)
}

data class coordinates(var x : Int , var y : Int, var z : Int) {
    operator fun plus (obj: coordinates):coordinates{
        this.x += obj.x
        this.y += obj.y
        this.z += obj.z

        return this
    }

    operator fun unaryMinus():coordinates{
        return coordinates(-x,-y,-z)
    }
    override fun equals(obj: Any?): Boolean {
        return obj is coordinates && this.x == obj.x && this.y == obj.y && this.z == obj.z
    }

}