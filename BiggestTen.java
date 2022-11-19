package Loops;

import java.util.Scanner;

public class BiggestTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,big=0,i=1;
		Scanner sc=new Scanner(System.in);
		while (i<10)
		{
		System.out.println("Enter the number:");
		n=sc.nextInt();
		if (n>big)
			big=n;
		i++;
		}
		System.out.println("Biggest number is "+big);
	}

}
