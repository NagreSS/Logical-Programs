package logical_programs;

public class Reverse_Words {

	public static void main(String[] args) {
		
		String s="my life my rules";
		String[]ar=s.split(" ");
		String rev="";
		
		for(int i=ar.length-1; i>=0; i--)
		{
			rev=rev+ar[i]+" "; //rules my life my
		}
		System.out.println(rev);
	}
}
