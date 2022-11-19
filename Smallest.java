package Loops;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int number,number2,i;
	int smallest=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number:");
	number=sc.nextInt();
	smallest=number;
	System.out.println("Enter the rest of numbers:");
	for (i=1; i<=9; i++)
	{
		number2=sc.nextInt();
		if(number2<smallest) {
			
			smallest=number2;
			}
		
	}
		System.out.println("Smallest Number is :"+smallest);
		sc.close();
	
	}

}
