package logical_programs;

public class String_Start_With_Particular_Word {

	public static void main(String[] args) {
	
		String [] s= {"ajeet","satish","amar","rahul","vishal","sam"};
		
		for(int i=0; i<s.length; i++)
		{			
			if(s[i].charAt(0)=='s')
			{
				System.out.println(s[i]);
			}
		}	
	}
}
