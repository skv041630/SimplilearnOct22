package practiceexamples;

import java.util.Scanner;

public class CheckingOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sk=new Scanner(System.in);
		System.out.println("Enter any number:");
		n=sk.nextInt();
		sk.close();
		if (n%2==0)
			System.out.println("Given number "+n+" "+ "is Even number.");
		else
			System.out.println("Given number: "+n+", "+ "is Odd number.");
		
		
	}

}
