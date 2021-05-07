//Create a class Car with brandName, color, and engineNumber as properties along with accelerate()
// and applyBrakes() as functions.
// In the main function create multiple objects of this class Car.*/
class Car(val brandName: String, val color: String, val engineNumber: Int) {

    fun accelerate() = println("Car is speeding up. Zoom!")

    fun applyBrakes() = println("Brakes applied!!! Screetch!")

}

fun main() {

    val myI20 = Car("Hyundai", "Black", 2342)
    myI20.accelerate()
    myI20.applyBrakes()

    val myAmaze = Car("Honda", "White", 7786)
    myAmaze.accelerate()
    myAmaze.applyBrakes()

}