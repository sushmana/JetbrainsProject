//In the previous example create an open function maxSpeed() in the parent class Car.
// Now override this function in the child classes and print the message as
// “Maximum speed of Hyundai is 120 kmph”
// and “Maximum speed of Honda is 150 kmph”.

open class Carrr(val brandName: String, val color: String) {

    fun speedUp() {
        println("The car is speeding up")
    }

    fun applyBrakes() {
        println("Brakes are applied")
    }

    // Create function maxSpeed() here
    open fun maxSpeed(){
        println("I can tell the max speed")
    }
}

class Hyundai(brandName: String = "Hyundai", color: String = "Black") : Carrr(brandName, color) {
    // override maxSpeed() here
    override fun maxSpeed(){
        println("Maximum speed of $brandName is 120 kmph")
    }
}

class Honda(brandName: String = "Honda", color: String = "White") : Carrr(brandName, color) {
    // override maxSpeed() here
    override fun maxSpeed(){
        println("Maximum speed of $brandName is 150 kmph")
    }
}

fun main(){
    val hyundai = Hyundai()
    hyundai.maxSpeed()

    val honda = Honda()
    honda.maxSpeed()
}