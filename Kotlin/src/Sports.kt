//Create an interface Games with the functions named as football, cricket and basketball,
// without any default implementations.
// Now create a class named Sports which implements this interface and override all the
// functions while printing a corresponding message for each sport.

// Create interface Games and class Sports here
interface Games{
    open fun football()
    open fun cricket()
    open fun basketball()
}

class Sports:Games{
    override fun football(){
        println("let's play football")
    }
    override fun cricket(){
        println("let's play cricket")
    }
    override fun basketball(){
        println("let's play basketball")
    }
}

fun main(){

    val sports = Sports()
    sports.football()
    sports.cricket()
    sports.basketball()

}