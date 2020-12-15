fun main() {
    val a=6 
    var sum=0
    for(i in 1..a){
        if(i%2==0) sum+=i 
    }
    println("Sum of even numbers till $a : $sum")
}
