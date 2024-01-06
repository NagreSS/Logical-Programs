//package logical_programs;

public class Counting {

	public static void main(String ... args)
	{
		String s="pujaaabbb";
		char []ar=s.toCharArray();
		int count=0;
		int maxcount=0;
		char chh=' ';

		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar.length; j++)
			{
				if(ar[i]==ar[j] && i!=j)
				{
					count++; //a-3  p-5
					ar[j]='0';	
				}
			}
			if(count>maxcount && ar[i]!='0')
			{
				maxcount=count;  //5
				chh=ar[i];
			}
			count=0;
		}
		System.out.println("max count "+chh);	
	}
}
