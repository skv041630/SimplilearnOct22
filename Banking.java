package Loops;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b,a,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your current balance:");
		b=s.nextInt();
		do
		{
		System.out.println("Please enter your choice from below");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Balance");
		System.out.println("4.Exit");
		c=s.nextInt();
		switch (c)
		{
		case 1:
		{
			System.out.println("Enter the amount you want to deposit:");
			a=s.nextInt();
			b=a+b;
			break;
		}
		case 2:
		{
			System.out.println("Enter the amount you want to withdraw:");
			a=s.nextInt();
			if(a<b)
			{
				b=b-a;
				System.out.println();
			}
			else
				System.out.println("You do not have sufficient balance to complete this transaction.");
			break;
		}
		case 3:
		{
			System.out.println("your current balance is: "+b);
			break;
		}
		default :
		{
			System.out.println("Thank you for banking with us.");
		}
		}
		}
		while (c!=4);
		
	}
}
