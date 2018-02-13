class Person constructor(n: String, ag: Int, hei: Double, gen: Char) {
    val name: String //name of person
    val age: Int //age in years
    val height: Double //height in meters
    val gender: Char //gender, m for male and f for female
    init {
        name = n
        age = ag
        height = hei
        gender = gen
    }
    override fun toString(): String {
        return "Name: $name" + ", age: $age" + ", height (meters): $height" + ", and gender: $gender"
    }
}