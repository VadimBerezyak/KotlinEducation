data class Car(val model: String, val year: Int, val color: String) {
    fun isCarsTheSame(firstCar: Car, secondCar: Car) {
       // val result = if (firstCar.hashCode().equals(secondCar.hashCode())) true else false

        println("Это одна и та же машина: " + (firstCar.hashCode().equals(secondCar.hashCode())))
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