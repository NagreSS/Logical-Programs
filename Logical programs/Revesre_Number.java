package logical_programs;

public class Revesre_Number {

	public static void main(String[] args) {
		
		long n=9657032185l;
		long sum=0;
		
		while(n>0)
		{
			long rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		System.out.println(sum);
		
	}
}
