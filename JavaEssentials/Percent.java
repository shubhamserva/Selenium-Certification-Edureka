import java.util.Scanner;

public class Percent {
	
	static Scanner in = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("enter Maths marks ");
		int  maths = in.nextInt();
		System.out.println("enter English marks ");
		int english = in.nextInt();
		System.out.println("enter Science marks ");
		int science = in. nextInt();
		System.out.println("enter Social Science marks ");
		int social = in.nextInt();
		int  sum = (maths + english + science + social)/4;
		if(sum<40) {
			System.out.println("The Performance is Poor");
		}
		else if(sum>=40 && sum <60) {
			System.out.println("The Performance is Averege");
		}
		else if(sum>=60 && sum <79) {
			System.out.println("The Performance is Good");
		}
		else if(sum>=80 && sum <89) {
			System.out.println("The Performance is Very Good");
		}
		else if(sum>=90) {
			System.out.println("The Performance is Excellent");
		}
		
	}
}