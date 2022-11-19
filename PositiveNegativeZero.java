package practiceexamples;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pnz=new Scanner(System.in);
		System.out.println("Enter any number:");
		double num=pnz.nextDouble();
		pnz.close();
		if (num>0)
			System.out.println(" Given number is a Positive number.");
		else if (num<0)
			System.out.println("Given number is a negative number.");
		else
			System.out.println("Gien number is Zero.");
	}

}
