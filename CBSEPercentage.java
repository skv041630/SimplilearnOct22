package FirstPack;

import java.util.Scanner;

public class CBSEPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float toatalmarkobtained=0;
		//Asking user to put total marks of subjects and total subjects
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of subjects:");
		float n=scan.nextFloat();
		System.out.println("Enter total marks in a subject:");
		float totalmarks=scan.nextFloat();;
		//sum of total marks of subjects
		float totalsum=totalmarks*n;
		//Asking user to put marks of each subject
		for (int i=1;i<=n;i++)
		{
			System.out.println("Enter the marks obtained in the subject");
			float markobtained=scan.nextFloat();;
			toatalmarkobtained=toatalmarkobtained+markobtained;
		}
		System.out.println("Total marks obtained in "+n+" Subjects is:"+toatalmarkobtained);
		float percentage=(toatalmarkobtained/totalsum)*100;
		System.out.println("Your percentage is:"+percentage);
		
		
		
		
	}

}
