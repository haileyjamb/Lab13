package edu.handong.csee.java.lab13.prob2;

public class Book {	//create a class "Book"
	
	private static int idCount = 0;	//declare an integer var. "idCount"
	private String BookName;	//declare a String "BookName"
	private int id;	//declare an integer var. "id"
	
	public Book(String Name)	//create a method w/ a string parameter
	{
		this.BookName = Name;	//Book's BookName's property is equal to a parameter "Name"
		idCount++;	//increase "idCount" by 1
		id = idCount;	//put "idCount" in "id"
	}
	
	public String toString()	//create a method 
	{
		return "\n\tId: " + id + "\n\tBook Name: " + BookName;	//return the message w/ variables "id" and "BookName"
	}
	
	public void show()	//create a method
	{
		System.out.println("<<<BOOK>>>" + this.toString());	//print out the message w/ "toString"
	}
}
