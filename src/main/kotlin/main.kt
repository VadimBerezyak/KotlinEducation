
    fun main() {
        val firstCar = Car("VAZ", 2023, "White")
        val secondCar = Car("VAZ", 2023, "White")
        firstCar.isCarsTheSame(firstCar, secondCar)
        secondCar.isCarsSimilar(firstCar, secondCar)
    }
