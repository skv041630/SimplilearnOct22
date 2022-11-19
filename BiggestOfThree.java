package practiceexamples;

import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter three numbers:");
		Scanner sc=new Scanner(System.in);
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		double n3=sc.nextDouble();
		sc.close();
		if (n1>n2&&n1>n3)
			System.out.println(+n1+" is the biggest of all the three given numbers.");
		else if (/*n1<n2&&*/n2>n3)
			System.out.println(+n2+" is the biggest of all the three given numbers.");
		else
			System.out.println(+n3+" is the biggest of all the three given numbers.");

	}

}
