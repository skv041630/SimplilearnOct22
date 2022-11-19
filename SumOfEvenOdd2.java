package Loops;

public class SumOfEvenOdd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variable Initialization
		int SumOfEven=0;
		int SumOfOdd=0;
		for (int i=1; i<=100; i++)
		{
			if (i%2==0)
				SumOfEven=SumOfEven+i;
			else
				SumOfOdd=SumOfOdd+i;
		}
		System.out.println("Sum of Even Number:"+SumOfEven);
		System.out.println("SUm of Odd Number"+SumOfOdd);
	}

}