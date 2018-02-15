import java.lang.System.exit //TODO: Figure out kotlin exit function and how it works

fun main(args: Array<String>) {
    var DrinkList = ArrayList<Drink>()
    var x: Int
    var input: Int
    while(true) {
        print("Enter drink name (or break to exit): ")
        var nom = readLine() ?: ""
        if(nom.equals("break")) break
        print("Enter type of drink: ")
        var v = readLine() ?: ""
        print("Enter price (USD): ")
        var mons: Float = readLine()?.toFloat() ?: 0.0F
        DrinkList.add(Drink(nom, v, mons))
    }
    while(true) {
        print("Choose action (1: set price, 2: print product info) ") //TODO: Figure out what else I want this to do
        x = readLine()?.toInt() ?: 0
        when(x) {
            1 -> {
                println("Choose item to set price: ")
                input = readLine()?.toInt() ?: 0
                var drink = DrinkList.get(input)
                println("Enter new price (current drink is $drink)")
                var newPrice: Float = readLine()?.toFloat() ?: 0.0F
                drink.price = newPrice
                DrinkList[input] = drink
                println("New price $newPrice set")
            }
            2 -> {
                println("Get info of which drink?")
                input = readLine()?.toInt() ?: 0
                try {
                    val infoGetter = DrinkList[input]
                    println(infoGetter)
                } catch(e: IndexOutOfBoundsException) {
                    println("Error: invalid input")
                }
            }
            else -> exit(0)
        }
    }

}