fun main() {
    val a=153
    var n : Int 
    var r : Int 
    var sum=0
    n=a
    while(n!=0){
        r=n%10
        sum+=r*r*r
        n/=10
    }
    if(sum==a) println("$a is an Armstrong Number.")
    else println("$a is not an Armstrong Number.")
}
