/*Kotlin Conditions and If..Else
Kotlin supports the usual logical conditions from mathematics:

Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
You can use these conditions to perform different actions for different decisions.

Kotlin has the following conditionals:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use when to specify many alternative blocks of code to be executed
Note: Unlike Java, if..else can be used as a statement or as an expression (to assign a value to a variable) in Kotlin. See an example at the bottom of the page to better understand it.

Kotlin if
Use if to specify a block of code to be executed if a condition is true.

Syntax
if (condition) {
  // block of code to be executed if the condition is true
}
Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.

In the example below, we test two values to find out if 20 is greater than 18. If the condition is true, print some text:

Example
if (20 > 18) {
  println("20 is greater than 18")
}
We can also test variables:

Example
val x = 20
val y = 18
if (x > y) {
  println("x is greater than y")
}
Example explained
In the example above we use two variables, x and y, to test whether x is greater than y (using the > operator). As x is 20, and y is 18, and we know that 20 is greater than 18, we print to the screen that "x is greater than y".

Kotlin else
Use else to specify a block of code to be executed if the condition is false.

Syntax
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
Example
val time = 20
if (time < 18) {
  println("Good day.")
} else {
  println("Good evening.")
}
// Outputs "Good evening."
Example explained
In the example above, time (20) is greater than 18, so the condition is false, so we move on to the else condition and print to the screen "Good evening". If the time was less than 18, the program would print "Good day".

Kotlin else if
Use else if to specify a new condition if the first condition is false.

Syntax
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
Example
val time = 22
if (time < 10) {
  println("Good morning.")
} else if (time < 20) {
  println("Good day.")
} else {
  println("Good evening.")
}
// Outputs "Good evening."
Example explained
In the example above, time (22) is greater than 10, so the first condition is false. The next condition, in the else if statement, is also false, so we move on to the else condition since condition1 and condition2 is both false - and print to the screen "Good evening".

However, if the time was 14, our program would print "Good day."

Kotlin If..Else Expressions
In Kotlin, you can also use if..else statements as expressions (assign a value to a variable and return it):

Example
val time = 20
val greeting = if (time < 18) {
  "Good day."
} else {
  "Good evening."
}
println(greeting)
When using if as an expression, you must also include else (required).

Note: You can ommit the curly braces {} when if has only one statement:

Example
fun main() {
  val time = 20
  val greeting = if (time < 18) "Good day." else "Good evening."
  println(greeting)
}
Tip: This example is similar to the "ternary operator" (short hand if...else) in Java. */