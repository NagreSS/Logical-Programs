package logical_programs;

public class Prime_No {

	public static void main(String[] args) {
		
		int n=5;
		int count=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}	
		}
		if(count==2)
		{
			System.out.println("No is prime");
		}
		else
			System.out.println("No is not prime");
	}
}
