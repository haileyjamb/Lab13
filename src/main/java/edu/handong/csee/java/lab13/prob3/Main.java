package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		double n1, n2;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter radius : ");
		n1 = keyboard.nextDouble();
		Circle c1 = new Circle(n1);
		
		System.out.println("Radius: " + c1.get_Radius());
		c1.display();
		
		System.out.print("Enter length and width: ");
		n1 = keyboard.nextDouble();
		n2 = keyboard.nextDouble();
		Rectangle r1 = new Rectangle(n1, n2);
		
		System.out.println("Length: " + r1.get_Length());
		System.out.println("Width: "+ r1.get_width());
		r1.display();
	}
}
