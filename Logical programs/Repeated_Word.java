package logical_programs;

public class Repeated_Word {

	public static void main(String[] args) {
		
		String s="my life my rules your life your rules understood";
		String[]ar=s.split(" ");
		
		for(int i=0; i<ar.length; i++)
		{
			int count=0;
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i].equals(ar[j]) && ar[i]!="0")
				{
					count++;
					ar[j]="0";
				}
			}
			if(count>0)
			{
				System.out.println(ar[i]);
			}
		}
	}
}
