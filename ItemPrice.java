package Loops;

import java.util.Scanner;

public class ItemPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number,rate,quantity;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Item Number:");
		number=sc.nextInt();
		System.out.println("Enter Item Name:");
		name=sc.next();
		System.out.println("Enter rate of item:");
		rate=sc.nextInt();
		System.out.println("Enter Item's Quantity");
		quantity=sc.nextInt();
		int Price=rate*quantity;
		System.out.println("Price of"+" "+quantity+" "+name+" "+"is"+" "+Price);
		sc.close();
	}

}
