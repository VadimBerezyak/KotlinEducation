fun main() {
        val firstCar = Car(model = "VAZ", year = 2023, color = "White") //TODO("всегда прописывать именновынные параметры!!!")
        val secondCar = Car(model = "VAZ", year = 2023, color = "White")
        firstCar.isCarsTheSame(firstCar, secondCar)
        secondCar.isCarsSimilar(firstCar, secondCar)
    println(firstCar)
    println(firstCar.hashCode())
    println(secondCar.hashCode())
    println(secondCar)


        var p1 = Point(x = 0.0f, y = 0.0f)   // TODO()
        var p2 = Point(x = 4.0f, y = 3.0f)
    println(p1.distance(p2))

    }

