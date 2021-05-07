//Create a parent class Car and functions speedUp() and applyBrake().
// Now create two different child classes inheriting class Car.
// Also, create objects for both of the child classes and
// use the functions that were created inside the parent class.
// Create classes

/*Q2
In the previous class Car give the properties as brandName and color.
Initialise the brandName as Hyundai and Honda for the respective classes.
 */
open class Carr(val brandName:String,val color:String){
    fun speedUp(){
        println("The car is speeding up")
    }
    fun applyBrakes(){
        println("Brakes are applied")
    }
}

class Car1(brandName:String="Hyundai",color:String="Red") : Carr(brandName,color) {

}

class Car2(brandName:String="Honda",color:String="Green") : Carr(brandName,color) {

}


fun main() {
    // create objects here and use their functions

    val c=Car1()
    val d=Car2()
    c.speedUp()
    c.applyBrakes()
    d.speedUp()
    d.applyBrakes()
}