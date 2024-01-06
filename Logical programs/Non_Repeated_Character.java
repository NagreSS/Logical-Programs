package logical_programs;

public class Non_Repeated_Character {

	public static void main(String[] args) {

		String s = "automation";
		char ar[] = s.toCharArray();

		for (int i = 0; i < ar.length; i++) {
			int count = 0;
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] == ar[j] && i != j) {
					count++;
					ar[j] = '0';
				}
			}
			if (count == 0) {
				System.out.println(ar[i]);
			}
		}

	}
}
