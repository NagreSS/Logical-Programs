Predicate


• A predicate is a function with a single argument and returns boolean value.
• To implement predicate functions in Java, Oracle people introduced Predicate
interface in 1.8 version (i.e.,Predicate<T>).
• Predicate interface present in Java.util.function package.
• It's a functional interface and it contains only one method i.e., test()


Ex:
interface Predicate<T> {
public boolean test(T t);
}
As predicate is a functional interface and hence it can refers lambda expression

Ex:1 Write a predicate to check whether the given integer is greater than 10 or not.
Ex:
public boolean test(Integer I) {
if (I >10) {
return true;
} else {
return false;
}
}
(Integer I) -> {
if(I > 10)
return true;
else
return false;
}
I -> (I>10);
Predicate<Integer> p = I ->(I >10);
System.out.println (p.test(100)); //true
System.out.println (p.test(7)); //false

Program:
1) import java.util.function;
2) class Test {
3) public static void main(String[] args) {
4) Predicate<Integer> p = I -> (i>10);
5) System.out.println(p.test(100));
6) System.out.println(p.test(7));
7) System.out.println(p.test(true)); //CE
8) }
9) }
# 1 Write a predicate to check the length of given string is greater than 3 or not.
Predicate<String> p = s -> (s.length() > 3);
System.out.println (p.test("rvkb")); //true
System.out.println (p.test("rk")); //false
#-2 write a predicate to check whether the given collection is empty or not.
Predicate p = c -> c.isEmpty();