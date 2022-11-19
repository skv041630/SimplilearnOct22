package practiceexamples;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the first number:");
		int n1=sc.nextInt();
		System.out.println("Enter Second number:");
		int n2=sc.nextInt();
		int res=0;
		System.out.println("Please enter your choice:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Divison");
		int ch=sc.nextInt();
		sc.close();
		switch (ch) 
		{
		case 1:
		{
			res=n1+n2;
			System.out.println("Addition of the given two number is: "+res);
			break;
		}
		
		case 2:
		{
			res=n1-n2;
			System.out.println("Subtraction of the given two number is: "+res);
			break;
		}
		case 3:
		{
			res=n1*n2;
			System.out.println("Multiplication of the given two number is: "+res);
			break;
		}
		case 4:
		{
			res=n1/n2;
			System.out.println("Division of the given two number is: "+res);
			break;
		}
		default :
		{
			System.out.println(+ch+" is not a valid choice, Please enter a valid choice:");
		}
		}
		
		
	}

}
