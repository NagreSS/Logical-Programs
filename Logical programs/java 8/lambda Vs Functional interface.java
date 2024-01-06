Functional Interface Vs Lambda Expressions:

Once we write Lambda expressions to invoke it's functionality, then Functional
Interface is required.
We can use Functional Interface reference to refer Lambda Expression.
Where ever Functional Interface concept is applicable there we can use Lambda
Expressions

Ex:1 Without Lambda Expression
1) interface Interf {
2) public void methodOne();}
3) public class Demo implements Interf {
4) public void methodOne() {
5) System.out.println("method one execution");
6) } }
7) public class Test {
8) public static void main(String[] args) {
9) Interf i = new Demo();
10) i.methodOne();
11) }
12) }


Above code With Lambda expression
1) interface Interf {
2) public void methodOne(); }
3) class Test {
4) public static void main(String[] args) {
5) Interf i = () -> System.out.println("method one execution");
6) i.methodOne();
7) }
8) }