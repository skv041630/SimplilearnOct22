package Loops;

import java.util.Scanner;

public class SomOfEvenWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int M,N;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range of the number:");
		M=sc.nextInt();
		System.out.println("Enter the last number of the range:");
		N=sc.nextInt();
		sc.close();
		while (M<=N)
		{
			if (M%2==0)
				System.out.print(M+" ");
		M++;
		}	
	}

}
