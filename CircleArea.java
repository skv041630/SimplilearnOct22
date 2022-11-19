package FirstPack;
import java.util.Scanner;
public class CircleArea {
	private static int solve(int A) {
		Double Area=(Math.PI)*A*A;
		int a=(int)Math.ceil(Area);
		System.out.println(a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		solve(r);

	}

}
