fun main() {
    while(true) {
        println("Enter 1 Number :")
        val num1 = readLine()?.toDoubleOrNull()
        println("Enter 2 Number :")
        val num2 = readLine()?.toDoubleOrNull()
     
         if(num1 == null || num2 == null)  {
        println("you entered the wrong number")
        continue
         }
    
         println("Enter an Operator (+,-,*,/,) :")
        val operatör = readLine()
    
        val total = when(operatör) {
        "+" -> num1 + num2
        "-" -> if(num1 < num2 ) num2 - num1 else num1 - num2
        "*" -> num1 * num2
        "/" -> if(num2 !=0.0) num1 / num2 else "0 is not divisible"
        else ->  {
            println("You entered the wrong operator")
            continue
           }
         }
        println("Conclusion $total")
        
        println("Do you want to go out? (y/n) :")
        val reply = readLine()
        
        if(reply?.lowercase() == "e") {
        println("Goodbye, Chief")
        break
        }
    }
}
