/*Kotlin Class Functions
You can also use functions inside a class, to perfom certain actions:

Example
Create a drive() function inside the Car class and call it: */

class Car(var brand: String, var model: String, var year: Int) {
  // Class function
  fun drive() {
    println("Wrooom!")
  }
}

fun main() {
  val c1 = Car("Ford", "Mustang", 1969)
  
  // Call the function
  c1.drive()
}
/*Tip: When a function is declared inside a class, it is known as a class function, or member function.

Note: When an object of the class is created, it has access to all of the class functions.

Class Function Parameters
Just like with regular functions, you can pass parameters to a class function:

Example
Create two functions: drive() and speed(), and pass parameters to the speed() function: */

class Car(var brand: String, var model: String, var year: Int) {
  // Class function
  fun drive() {
    println("Wrooom!")
  }
  
  // Class function with parameters
  fun speed(maxSpeed: Int) {
    println("Max speed is: " + maxSpeed)
  }
}

fun main() {
  val c1 = Car("Ford", "Mustang", 1969)
  
  // Call the functions
  c1.drive()
  c1.speed(200)
}