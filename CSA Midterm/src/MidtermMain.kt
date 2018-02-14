fun main(args: Array<String>) {
    val Mid = MidtermMethod()
    println("AP CS A Midterm Program 1: sum100")
    println("" + Mid.sum100() + "\n") //TODO: Figure out why I can't concatenate an int and then a string without the "" part
    println("AP CS A Program 2: maxOfTwo")
    print("Enter int value: ")
    var num1 = readLine()?.toInt() ?:0
    print("Enter int value: ")
    var num2 = readLine()?.toInt() ?:0
    println("The larger number is " + Mid.maxOfTwo(num1, num2) + "\n")
    println("AP CS A Program 3: evenlyDivisible")
    println("Using same ints from earlier, is $num1 divisible by $num2? " + Mid.evenlyDivisible(num1, num2) + "\n")
    println("AP CS A Program 4: countAa")
    print("Enter a string: ")
    val aaa: String = readLine() ?:""
    println("The string $aaa has " + Mid.countAa(aaa) + " A's.")
}