package Loops;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=sc.nextInt();
		while(number>0)
		{
			digit=number%10;
			sum=sum+digit;
			number=number/10;
		
		}
		System.out.println("Sum of the digits of given number is:"+sum);
		}

}
