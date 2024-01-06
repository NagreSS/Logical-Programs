What is Lambda Expression:

• Lambda Expression is just an anonymous (nameless) function. That means the
function which doesn't have the name, return type and access modifiers.
• Lambda Expression also known as anonymous functions or closures.


Ex: 1
public void m1() 
{
sop("hello"");
}

lambda ex:
() ->{
sop("hello"");
}

() -> { sop("hello"); }
() -> sop("hello");

Ex:2
public void add(int a, int b) {
sop(a+b);
}
lambda ex:
(int a, int b) -> sop(a+b);
• If the type of the parameter can be decided by compiler automatically based on
the context then we can remove types also.
• The above Lambda expression we can rewrite as
(a,b) -> sop (a+b);
Ex: 3
public String str(String str) {
return str;
}


Lambda ex:
(String str) -> return str;
(str) -> str;
Conclusions:
1. A lambda expression can have zero or more number of parameters (arguments).
2. Ex:
3. () -> sop("hello");
4. (int a ) -> sop(a);
5. (int a, int b) -> return a+b;
6. Usually we can specify type of parameter. If the compiler expects the type
based on the context then we can remove type. i.e., programmer is not required.
7. Ex:
8. (int a, int b) -> sop(a+b);
9. (a,b) -> sop(a+b);
10.If multiple parameters present then these parameters should be separated with
comma (,).
11.If zero number of parameters available then we have to use empty parameter [
like ()].
12. Ex: () -> sop("hello");
13.If only one parameter is available and if the compiler can expect the type then
we can remove the type and parenthesis also.
14. Ex:
15. (int a) -> sop(a);
16. (a)-> sop(a);
17. a -> sop(a);
18.Similar to method body lambda expression body also can contain multiple
statements. If more than one statements present then we have to enclose inside
within curly braces. If one statement present then curly braces are optional.
19.Once we write lambda expression we can call that expression just like a
method, for this functional interfaces are required