import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scn.nextLine();
		
		String newStr = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			 newStr+= str.charAt(i);
		}
		System.out.println("The reversed string is  "+ newStr );
	}
}