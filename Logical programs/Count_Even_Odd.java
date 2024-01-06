package logical_programs;

public class Count_Even_Odd {

	public static void main(String[] args) {
		
		int n=12345;
		int counteven=0;
		int countodd=0;
		//added comments
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				counteven++;
			}
			else if(rem%2!=0)
			{
				countodd++;
			}
			n=n/10;
			
		} 
		System.out.println(counteven);
		System.out.println(countodd);
	}
}
