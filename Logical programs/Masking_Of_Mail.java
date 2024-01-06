package logical_programs;

public class Masking_Of_Mail {

	public static void main(String[] args) {

		String email = "satishnande@gmail.com";
		System.out.println(masking(email));	
	}
	public static String masking(String email)
	{
		int index=email.indexOf("@");
		String split=email.substring(index);
		String mask="";
		
		int size=email.substring(6, index).length();
		System.out.println(size);
		for(int i=0; i<size; i++)
		{
			mask+="X";
		}
		
		mask=email.substring(0,6)+mask+split;
		return mask;
	}
}