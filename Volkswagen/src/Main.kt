import java.lang.System.exit //you know, kotlin should have a built in exit function that overrides this one.

fun main(args: Array<String>) {
    var n1: Int
    var n2: Int
    val Uh = FunnyPythagorean()
    while(true) {
        n1 = 0
        n2 = 0
        try {
            print("Enter larger number: ") //TODO: Implement sorting so that the order won't matter
            n1 = readLine()?.toInt() ?: 0
            print("Enter smaller number: ")
            n2 = readLine()?.toInt() ?: 0
            Uh.calc(n1, n2)
        } catch(e: NumberFormatException) {
            println("Program terminated.")
            exit(0)
        }
    }

}