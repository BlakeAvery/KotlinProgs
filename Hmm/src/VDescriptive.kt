fun main(args: Array<String>) {
    val systemInfo = System.getProperty("os.name") + " " + System.getProperty("os.version")
    println("Your OS is detected to be $systemInfo.")
    println("Welcome to Kotlin code. I'm not a good programmer.")
    print("What do you wanna do? ")
    var input: String = readLine() ?:""
    when(input) { //WOW KOTLIN SWITCHES MAKE ME LESS SUICIDAL!
        "hello" -> println("Hello? Whom is speaking???????")
        "crack" -> println("That's, um. Illegal.")
        "smash" -> println("OH")
        "actually program" -> println("I'm trying my best, don't bully me.")
        "memes" -> println("follow me on instagram then")
        "can i get uuuuuh big macc" -> println("McDonald's is a terrible place to work at. Please help me.")
        else -> {
            print("Wow. None of that was a hard-coded option. Well, I suppose it's time to do stuff. ")
        }
    }
    System.out.println("This one's a Java println statement. Nice, innit?")
    print("Ok, back to Kotlin. Enter a number! ")
    var num: Int = readLine()?.toInt() ?: 0 //I liked scanner. Scanner was more fun, but this doesn't make me declare a new object.
    println("OK. We're passing this to a new object, called ThinkingEmoji.")
    val ThinkingEmoji = Meme(num)
    println("Is the number you entered even? " + ThinkingEmoji.isEven())
    println("Next ThinkingEmoji method! This one does a thing where it turns the number into a string.")
    println(ThinkingEmoji.toString())
    println("Next! Gimme a thingy to do to the number. (+, -, *, /)")
    val para: String = readLine()?.toString() ?:"+"
    println("OK, now another number!")
    num = readLine()?.toInt() ?: 0
    println("OK, math time!")
    val lambdaTest = {} //This is just here, Good meme, eh?
    println("The result of your math was " + ThinkingEmoji.Mather(para, num))
}