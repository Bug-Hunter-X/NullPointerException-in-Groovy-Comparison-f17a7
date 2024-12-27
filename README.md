# Groovy NullPointerException in Comparison

This example demonstrates a common pitfall in Groovy: the implicit null handling in comparisons can cause unexpected `NullPointerExceptions`. The `myMethod` function aims to return the larger of two numbers, but without explicit null checks, calling it with a `null` value will result in an exception.

This repository provides a simple Groovy script showcasing the issue and its solution.