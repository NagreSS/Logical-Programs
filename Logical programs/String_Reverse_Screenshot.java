package logical_programs;

import java.io.File;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class String_Reverse_Screenshot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data");
		String name=sc.next();
		
		String rev="";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(name))
		{
			System.out.println("Given data is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		//	File src=((TakesScreenshot)driver).getScreenShotAs(OutputType.File);
		//	FileUtils.copyFileToDirectory(src, new File("path where to save ss"));
			
		}
		
	}
}
