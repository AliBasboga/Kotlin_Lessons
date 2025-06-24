/* Kotlin Ranges
With the for loop, you can also create ranges of values with "..":

Example
Print the whole alphabet:

for (chars in 'a'..'x') {
  println(chars)
}
You can also create ranges of numbers:

Example
for (nums in 5..15) {
  println(nums)
} 
Note: The first and last value is included in the range.

Check if a Value Exists
You can also use the in operator to check if a value exists in a range:

Example
val nums = arrayOf(2, 4, 6, 8)
if (2 in nums) {
  println("It exists!")
} else {
  println("It does not exist.")
}
Example
val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
if ("Volvo" in cars) {
  println("It exists!")
} else {
  println("It does not exist.")
} 
Break or Continue a Range
You can also use the break and continue keywords in a range/for loop:

Example
Stop the loop when nums is equal to 10:

for (nums in 5..15) {
  if (nums == 10) {
    break
  }
  println(nums)
} 
Example
Skip the value of 10 in the loop, and continue with the next iteration:

for (nums in 5..15) {
  if (nums == 10) {
    continue
  }
  println(nums)
} */