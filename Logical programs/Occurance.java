public class Count
{
 public static void main(String args[])
{
String str="I am expert in Automation";
long count=str.chars().filter(ch->ch=='e').count();
System.out.println(count);

}
}