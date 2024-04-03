data class Rectangle(val pointUpLeft: Point, val pointDownRight: Point ) {
    fun squareOfRectangle () : Float {
        return (pointUpLeft.x - pointDownRight.x)*(pointDownRight.y-pointUpLeft.y)
    }
}

//учитывать тип результата при чущественном увеличении значения Int -> Long

