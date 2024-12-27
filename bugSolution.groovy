```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null // Or handle nulls as needed
  } else if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 10) // Prints 10
println myMethod(10, 5) // Prints 10
println myMethod(null, 5) // Prints null
println myMethod(5, null) // Prints null
```