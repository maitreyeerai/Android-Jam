fun main() {
    //taking input from the user 
    //print("Enter side 1 : ")
    //val a = readLine()
    val a=10 
    val b=9 
    val c=11
    if(a==b && a==c) println("It is an equilateral triangle.")
    else if(a==b || b==c || c==a) println("It is an isosceles triangle.")
    else println("It is a scalene triangle.") 
}
