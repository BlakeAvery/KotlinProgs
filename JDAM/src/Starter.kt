import java.lang.System.*
fun main(args: Array<String>) {
    var nom: String
    var age: Int
    var tallness: Double
    var mf: Char
    while(true) {
        print("Enter a name: ")
        nom = readLine()?: ""
        print("Enter your age: ")
        age = readLine()?.toInt() ?:0
        print("Enter your height, in meters: ")
        tallness = readLine()?.toDouble() ?:0.0
        print("Enter your gender, m or f: ")
        mf = readLine()?.get(0) ?:'m'
        println(mf)
        println(mf.compareTo('m'))
        println(mf.compareTo('f'))
        break
        //Following code doesn't work, for some reason. TODO: Find out why!
        /*if ((mf.compareTo('m') != 0) || (mf.compareTo('f') != 0)) {
            print("Not a valid gender. What are you, mentally disabled?")
            exit(3)
        } else {
            print("Did you know while(true) loops aren't necessary for creating a single object?")
            break
        } */
    }
    val ningen = Person(nom, age, tallness, mf)
    print(ningen.toString())
}