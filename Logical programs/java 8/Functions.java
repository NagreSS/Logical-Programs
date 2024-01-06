Functions

• Functions are exactly same as predicates except that functions can return any
type of result but function should (can) return only one value and that value can
be any type as per our requirement.
• To implement functions oracle people introduced Function interface in
1.8version.

• Function interface present in java.util.function package.
• Function interface contains only one method i.e., apply()
interface Function(T,R) {
public R apply(T t);
}

Assignment: Write a function to find length of given input string.
Ex:
1) import java.util.function.*;
2) class Test {
3) public static void main(String[] args) {
4) Function<String, Integer> f = s ->s.length();
5) System.out.println(f.apply("Times"));
6) System.out.println(f.apply("Soft"));
7) }
8) }
Note: Function is a functional interface and hence it can refer lambda expression.
Differences between Predicate and Function
Predicate Function
To implement conditional checks
we should go for predicate
To perform certain operation and to return some
result we should go for function.
Predicate can take one type
parameter which represents input
argument type. Predicate<T>
Function can take 2 type parameters. First one
represent input argument type and Second one
represent return Type. Function<T,R>
Predicate interface defines only one
method called test()
Function interface defines only one Method
called apply().
public boolean test(T t) public R apply(T t)
Predicate can return only boolean
value. Function can return any type of value
Note: Predicate is a boolean valued function and(), or(), negate() are default methods,
present inside Predicate interface.