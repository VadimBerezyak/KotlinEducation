
    fun main() {
        val firstCar = Car("VAZ", 2023, "White", "Gas")
        val secondCar = Car("VAZ", 2023, "White", "Gas")
        firstCar.isCarsTheSame(firstCar, secondCar)
        secondCar.isCarsSimilar(firstCar, secondCar)
    }
