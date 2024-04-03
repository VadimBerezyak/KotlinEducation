class Car(val model: String,
          val year: Int,
          val color: Color,
          val luxVersion: Boolean?) {
    fun isCarsTheSame(firstCar: Car, secondCar: Car) {
       // val result = if (firstCar.hashCode().equals(secondCar.hashCode())) true else false
        println("Это одна и та же машина: " + (firstCar.hashCode() == secondCar.hashCode()))
    }

    fun isCarsSimilar(firstCar: Car, secondCar: Car) {
        val areCarsSimilar: Boolean
        if (
            (firstCar.year == secondCar.year) &&
            (firstCar.model == secondCar.model) &&
            (firstCar.color == secondCar.color) &&
            (firstCar.luxVersion == secondCar.luxVersion)
        ) {
            areCarsSimilar = true
        } else {
            areCarsSimilar = false
        }
        println("Машины одинаковы по техническим характеристикам: $areCarsSimilar")
    }
}