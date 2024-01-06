package logical_programs;

public class Star_Pattern_Right_Angle_Triangle {

	/*
	 
	 * 
	 * *
	 * * *
	 * * * *
	
	 */
	
	public static void main(String[] args) {
		
		for(int i=4; i>=0; i--)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
}
