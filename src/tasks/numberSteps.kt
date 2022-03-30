fun main() {
    println("Please enter end point and step")
    val end = readLine()?.toInt()
    val step = readLine()?.toInt()

    if (end != null) {
        if (step != null) {
        numstep(end, step)
        }
    }
}

fun numstep(end: Int, step:Int){

    var numlist = arrayListOf<Int>()
    end.let{
        step.let{
            //[0,2,4,6,8]
            for (i in 0..end step step){
                numlist.add(i)
            }

        }

    }
    println(numlist)
}