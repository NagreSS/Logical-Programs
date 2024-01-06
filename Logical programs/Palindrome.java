//package logical_programs;

public class Palindrome {

	public void m1(int n)
	{
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Number is Palindrome");
		}
		else
			System.out.println("Number is Not palindrome");
	}
	
	public void m1(String s)
	{
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
			System.out.println("String is not palindrome");
	}
	
	public static void main(String[] args) {
		
		Palindrome p=new Palindrome();
		p.m1("nayan");
	}
}
