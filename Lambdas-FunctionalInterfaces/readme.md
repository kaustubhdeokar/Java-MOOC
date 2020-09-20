This has been taken from a course title as

# Using Lambda Expressions in Java Code	
## Jose Paumard
### Pluralsight

[Using Lambda Expressions in Java Code](https://app.pluralsight.com/library/courses/lambda-expressions-java-code/)


A Lambda Expression implements a Functional Interface.

What is a Functional Interface.
- An Interface with one abstract method. (except static,default and methods on object(Tostring).

All the functional interfaces are a part of the java.util.function toolbox.
More than 40 functional interfaces.
>Four main categories.<br>
`Supplier` - Takes no argument returns one<br>
`Consumer` - Takes an argument returns none<br>
`Predicate`- Takes an argument returns boolean - used in filter -streams<br>
`Function` - Takes an object returns another object - map -streams 

Also chaining can be done on the above by using their default methods.
/
