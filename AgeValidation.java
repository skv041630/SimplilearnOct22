package practiceexamples;

import java.util.Scanner;

public class AgeValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ag=new Scanner(System.in);
		System.out.println("Please enter your age (in years):");
		int age=ag.nextInt();
		ag.close();
			if (age>18)
				System.out.println("You are an adult.");
		
			else if (age>0&&age<18)
			System.out.println("You are minor.");
		
			if (age<=0)
				System.out.println("It's not a valid age, Please enter valid age.");
		
	}

}
