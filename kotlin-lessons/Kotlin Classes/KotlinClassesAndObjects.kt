/*Kotlin Classes/Objects
Everything in Kotlin is associated with classes and objects, along with its properties and functions. For example: in real life, a car is an object. The car has properties, such as brand, weight and color, and functions, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

Create a Class
To create a class, use the class keyword, and specify the name of the class:

Example
Create a Car class along with some properties (brand, model and year) */

class Car {
  var brand = ""
  var model = ""
  var year = 0
} 
/*A property is basically a variable that belongs to the class.

Good to Know: It is considered good practice to start the name of a class with an upper case letter, for better organization.

Create an Object
Now we can use the class named Car to create objects.

In the example below, we create an object of Car called c1, and then we access the properties of c1 by using the dot syntax (.), just like we did to access array and string properties:
*/
Example
// Create a c1 object of the Car class
val c1 = Car()

// Access the properties and add some values to it
c1.brand = "Ford"
c1.model = "Mustang"
c1.year = 1969

println(c1.brand)   // Outputs Ford
println(c1.model)   // Outputs Mustang
println(c1.year)    // Outputs 1969 
Multiple Objects
You can create multiple objects of one class:

Example
val c1 = Car()
c1.brand = "Ford"
c1.model = "Mustang"
c1.year = 1969

val c2 = Car()
c2.brand = "BMW"
c2.model = "X5"
c2.year = 1999

println(c1.brand)  // Ford
println(c2.brand)  // BMW
