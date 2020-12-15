fun main() {
    val a=8208  
    var n : Int 
    var r : Int 
    var sum=0
    var p=0
    n=a
    while(n!=0){
        n/=10
        ++p
    }
    n=a
    while(n!=0){
        r=n%10
        sum+=Math.pow(r.toDouble(),p.toDouble()).toInt()
        n/=10
    }
    if(sum==a) println("$a is an Armstrong Number.")
    else println("$a is not an Armstrong Number.")
}
