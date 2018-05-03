package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;	//get input from the keyboard

public class Main {	//create a main class

	public static void main(String[] args)	//create a main method
	{
		double n1, n2;	//declare double var.'s "n1" and "n2"
		Scanner keyboard = new Scanner(System.in);	//create an object of Scanner keyboard
		
		System.out.print("Enter radius : ");	//print out the message
		n1 = keyboard.nextDouble();	//put the input in var. "n1"
		Circle c1 = new Circle(n1);	//create an object of Circle class
		
		System.out.println("Radius: " + c1.get_Radius());	//print out the message w/ get_Radius
		c1.display();	//go to display w/ "c1" object
		
		System.out.print("Enter length and width: ");	//print out the message
		n1 = keyboard.nextDouble();	//put the input in var. "n1"
		n2 = keyboard.nextDouble();	//put the input in var. "n2"
		Rectangle r1 = new Rectangle(n1, n2);	//create an object of Rectangle class
		
		System.out.println("Length: " + r1.get_Length());	//print out the line w/ get_Length() 
		System.out.println("Width: "+ r1.get_width());	//print out the line w/ get_width()
		r1.display();	//go to display() w/ "r1" object
	}
}
