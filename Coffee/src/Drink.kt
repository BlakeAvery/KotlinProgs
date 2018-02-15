class Drink constructor(n: String, t: String, p: Float) {
    val name: String
    val type: String
    var price: Float
    init {
        name = n
        type = t
        price = p
    }

    override fun toString(): String {
        return "$name, a $type drink, costs $$price."
    }
}