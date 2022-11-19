package practiceexamples;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter an year to check if it's Leap Year.");
		Scanner yr=new Scanner(System.in);
		int n1=yr.nextInt();
		yr.close();
		if (n1%4==0&&n1%100!=0)
			System.out.println("Given year is a Leap year.");
		else if (n1%100==0&&n1%400==0)
			System.out.println("Given year is a Leap Year.");
		else
			System.out.println("Given year is not a Leap Year.");
	}

}
