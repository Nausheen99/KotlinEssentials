fun main() {

    val nullcheck: String? = null

    // There are 4 ways to check the nullability of the string

    // Elvis operator
    val elvis = nullcheck?.length ?: 0

    // Safe call operator
    val safecall = nullcheck?.length

    //!!
    val notnull = nullcheck!!.length

    // Null check
    val nullcheckauto = if (nullcheck != null) nullcheck.length else 0

}