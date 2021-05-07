/*Create a list which contains math function operators (+, -, *, /) as characters. Iterate through this list and pass two variables along with the list item (operator) to a function and perform all the math functions on them. Perform the operation corresponding to the character encountered by the iterator.
Given:
Index of + is 0
Index of - is 1
Index of * is 2
Index of / is 3
In case of division check if the divisor is 0 or not.*/

fun main() {
    var arr=arrayListOf('+','-','*','/')

    for(i in arr){
        var output=operation(100,0,i)
        println("The output of operation ${i} is ${output}")
    }

}

fun operation(a:Int,b:Int,operator:Char):Int{
    var c=0
    if(operator=='+'){
        c=a+b
    }
    if(operator=='-'){
        c=a-b
    }
    if(operator=='*'){
        c=a*b
    }
    if(operator=='/'){
        if(b!=0){
            c=a/b
        }
        else{
            c=0
        }
    }
    return c;
}