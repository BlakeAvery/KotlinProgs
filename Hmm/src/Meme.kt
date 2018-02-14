import java.lang.System.exit
//import kotlin.system.exitProcess i dunno, this worked that one time without having to import anything???

class Meme constructor(manko: Int) {
    private var bussy: Int = manko
    fun isEven(): Boolean {
        return (bussy % 2 == 0)
    }
    override fun toString(): String {
        return bussy.toString() + " is a number!"
    }
    fun Mather(op: String, numb: Int): String {
        try {
            return when(op) {
                "+" -> (bussy + numb).toString()
                "-" -> (bussy - numb).toString()
                "*" -> (bussy * numb).toString()
                "/" -> (bussy / numb).toString()
                else -> throw IllegalArgumentException()
            }
        } catch(e: IllegalArgumentException) {
            return "Fun fact, I'm too lazy to implement checking for proper input in main. Oh well."
            exit(19)
        }

    }
}