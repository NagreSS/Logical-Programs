package logical_programs;

public class Repeated_Character {

	public static void main(String[] args) {
		
		String s="ram and shyam";
		char ar[]=s.toCharArray();
	
		for(int i=0; i<ar.length; i++)
		{
			int count=1;
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]==ar[j] && ar[i]!=' ')
				{
					count++;
					ar[j]='0';
				}
			}
			if(count>1 && ar[i]!='0')
			{
				System.out.println(ar[i]+" "+count);
			}
		}
	}
}