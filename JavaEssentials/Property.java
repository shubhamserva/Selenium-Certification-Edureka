
import java.util.Scanner;

class property{
	static Scanner in = new Scanner(System.in);

	public static void calculate(){	
			System.out.println("enter Michael's Bid Value");
		int  Mv= in.nextInt();
		System.out.println("enter Bruce's Bid ");
		int Bv= in.nextInt();
		if(Mv>Bv) {
			System.out.println("Michael won the Bid");
		}
		else if(Bv>Mv){
			System.out.println("Bruce won the Bid");
}
		else{
			System.out.println("Same Bid entered Please Bid Again");
		calculate();
	}
	
}
	public static void main(String args[]){
		calculate();
		
}	
}