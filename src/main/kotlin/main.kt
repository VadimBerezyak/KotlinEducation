fun main() {
        val firstCar = Car(model = "VAZ", year = 2023, color = Color.RED, luxVersion = true)
        val secondCar = Car(model = "VAZ", year = 2023, color = Color.YELLOW, luxVersion = true)
        firstCar.isCarsTheSame(firstCar, secondCar)
        secondCar.isCarsSimilar(firstCar, secondCar)

    println(firstCar)
    println(firstCar.hashCode())
    println(secondCar.hashCode())
    println(secondCar)

    val p1 = Point(x = 0.0f, y = 3.0f)
    val p2 = Point(x = 4.0f, y = 0.0f)
    val rectangle = Rectangle(p1, p2)

    println(p1.distance(p2))
    println(rectangle.squareOfRectangle())
    println(rectangle.perimeterOfRectangle())
    }

