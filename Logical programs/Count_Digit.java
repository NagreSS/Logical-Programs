//package logical_programs;

public class Count_Digit {

	public static void main(String[] args) {
		// hello new changes
		
		int n=12345;
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		
		System.out.println(count);
	}
}
