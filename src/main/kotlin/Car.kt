class Car(val model: String, val year: Int, val color: String) {
    fun isCarsTheSame(firstCar: Car, secondCar: Car) {
        println("Это одна и та же машина: " + firstCar.equals(secondCar))
    }

    fun isCarsSimilar(firstCar: Car, secondCar: Car) {
        val result: Boolean
        if (
            (firstCar.year == secondCar.year) &&
            (firstCar.model == secondCar.model) &&
            (firstCar.color == secondCar.color)
        ) {
            result = true
        } else {
            result = false
        }
        println("Машины одинаковы по техническим характеристикам: $result")
    }
}