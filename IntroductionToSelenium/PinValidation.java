
import java.util.Scanner;

public class PinValidation {

	public static void main(String arg[]) {
		pinValidation();
	}

	public static void pinValidation() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your pin number");
		int value = Integer.parseInt(scn.nextLine());

		int pinNumber = 2112;
		int count = 0;
		for (int i = 0; i < 3; i++) {
			if (value == pinNumber) {
				System.out.println("Thank you for banking with us. Here are your options.. ");
				break;
			} else
				count++;
		}
		if (count == 3) {
			System.out.println("Your ATM card has been blocked due to  3 unsuccessful attempts");
		}
	}
}