import kotlin.math.pow
import kotlin.math.sqrt

data class Point(val x: Float, val y: Float) {

   public fun distance(p2: Point): Float {
       return (sqrt((this.x - p2.x).pow(2) +(this.y - p2.y).pow(2))).toFloat()
    }
}
// либо FLOAT либо использовать постобработку round() итп