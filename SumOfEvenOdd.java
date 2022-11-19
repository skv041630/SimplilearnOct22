package Loops;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variable Initialization
		int SumOfEven=0;
		int SumOfOdd=0;
		int i=1;
		
		/*do
		{
			if (i%2==0)
				SumOfEven=SumOfEven+i;
			else
				SumOfOdd=SumOfOdd+i;
		}*/
		while (i<=100); 
		{
			if (i%2==0)
				SumOfEven=SumOfEven+i;
			else
				SumOfOdd=SumOfOdd+i;
		}
			i++;
			
		
		System.out.println("Sum of Even Number:"+SumOfEven);
		System.out.println("SUm of Odd Number"+SumOfOdd);
	

}
}
