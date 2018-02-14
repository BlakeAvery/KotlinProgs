class Meme constructor(manko: Int) {
    private var bussy: Int
    init{
        bussy = manko
    }
    fun isEven(): Boolean {
        return (bussy % 2 == 0)
    }
    override fun toString(): String {
        return bussy.toString() + " is a number!"
    }
    fun Mather(op: String, numb: Int): Int {
        when(op) {
            "+" -> return bussy + numb
            "-" -> return bussy - numb
            "*" -> return bussy * numb
            "/" -> return bussy / numb
            else -> throw IllegalArgumentException() //Try-catch block may work here, but I'm legit too lazy right now to implement.
        }
    }
}