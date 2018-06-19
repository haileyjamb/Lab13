package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner;	//get inputs from the keyboard

public class prob4 {	//create a class
	
	public static boolean equals(int[][] m1, int[][] m2)	//create a method w/ parameter arrays "m1" and "m2"
	{
		int count = 0;	//declare an integer var.
		if(m1.length != m2.length)	//if the number of row is different
			return false;	//return false
			for(int i =0; i < m1.length; i++)	
			{
				for((int j =0; j < m1[i].length; j++) //check the elements up to the "length" size
						{
							if(m1[i][j] != m2[i][j])	//if the elements are not the same
								count++;	//then, increase "count"
						}
			}
			if(count <= 3)	//if "count" is the same or less than 3
				return true;	//return true
			else	//or
				return false;	//return false
	}
	
	public static void main(String[] args)	//create a main method
	{
		int n1, n2 = 0;	//declare integer var.'s "n1" and "n2"
		Scanner keyboard = new Scanner(System.in);	//create an object of Scanner class
		System.out.print("Enter row size(maximum 5): ");	//print out the message
		n1 = keyboard.nextInt();	//put input in var. "n1"
		
		System.out.print("Enter column size(maximum 5): ");	//print out the message
		n2 = keyboard.nextInt();	//put input in var. "n2"
		int[][]m1 = new int [n1][n2];	//create an object of int[][]m1
		
		System.out.print("Enter row size(maximum 5): ");	//print out the message
		n1 = keyboard.nextInt();	//put input in var. "n1"
		System.out.print("Enter column size(maximum 5): ");	//print out the message
		n2 = keyboard.nextInt();	//put input in var. "n2"
		int[][]m2 = new int [n1][n2];	//create an object of int[][]m2
		
		System.out.print("Enter List: ");	//print out the message
		for(int i = 0; i < m1.length; i++)	
		for(int j = 0; j < m1[i].length; j++) //iterate upto "length" size
			m1[i][j] = keyboard.nextInt();	//put input in m1[i]][j]
		
		System.out.print("Enter list2: ");	//print out the message
		for(int i =0; i < m2.length; i++) {	
			for(int j= 0; j < m2[i].length; j++)	//iterate upto "length" size
				m2[i][j] = keyboard.nextInt(); //put input in m2[i][j]
		}
		
		for(int i = 0; i < m1.length; i++) {	
			for(int j = 0; j < m1[i].length; j++)	//iterate upto "length" size
				System.out.print(m1[i][j] + " ");	//print out the message (element and a blank space)
			System.out.println();//Terminates the current line by writing the line separator string
		}
		
		System.out.println();	//Terminates the current line by writing the line separator string
		for(int i = 0; i < m2.length; i++) {
			for(int j = 0; j < m2[i].length; j++)	//iterate upto "length" size
				System.out.print(m2[i][j] + " ");	//print out the message (element and a blank space)
			System.out.println();//Terminates the current line by writing the line separator string
		}
		System.out.println();	//Terminates the current line by writing the line separator string
		
		if(equals(m1,m2))	//if m1 and m2 are the same
			System.out.println("The two arrays are approximately identical.");	//print out the line
		else	//or	
			System.out.println("The two arrays are not identical.");	//print out the line
	}
}
