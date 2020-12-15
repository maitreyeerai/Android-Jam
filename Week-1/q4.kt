fun main() {
    val n=55
    if (n%5==0 && n%11==0) println("It is divisible by both 5 & 11.")
    else if (n%5==0) println("It is divisible by 5")
    else if (n%11==0) println("It is divisible by 11.")
    else println("It is divisible by neither.")
}
