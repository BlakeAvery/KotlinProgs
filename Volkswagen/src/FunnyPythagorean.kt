class FunnyPythagorean {
    fun calc(num1: Int, num2: Int) {
        println("Inequality: " + (num1 - num2) + " < x < " + (num1 + num2))
        println("a = " + (Math.pow(num1.toDouble(), 2.0) - Math.pow(num2.toDouble(), 2.0)))
        println("c = " + (Math.pow(num1.toDouble(), 2.0) + Math.pow(num2.toDouble(), 2.0)))
    }
}