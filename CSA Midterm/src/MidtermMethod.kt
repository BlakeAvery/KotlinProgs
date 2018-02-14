class MidtermMethod {
    fun sum100(): Int {
        var sum: Int = 0
        for(x in 1..100) {
            sum += x
        }
        return sum
    }
    fun maxOfTwo(a: Int, b: Int): Int {
        if(a > b) return a
        else return b
    }
    fun evenlyDivisible(a: Int, b: Int): Boolean {
        return a % b == 0
    }
    fun countAa(words: String): Int {
        var counter: Int = 0
        var aa: CharArray = words.toCharArray()
        for (x in 0 until words.length) {
            if((aa[x] == 'a') || (aa[x] == 'A')) counter++
        }
        return counter
    }
}