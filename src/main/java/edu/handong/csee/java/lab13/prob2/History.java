package edu.handong.csee.java.lab13.prob2;

public class History extends Book{	//create a sub class based on a super class "Book"
	
	private String Author;	//declare a string "Author"
	
	public History(String Name, String Author)	//create a method w/ string parameters
	{
		super(Name);	//bring the constructor in parent class which is Book
		
		this.Author = Author;	//properties of Author is the same as a parameter string "Author"
	}
	
	public String toString()	//create a method
	{
		return super.toString() + "\n\tAuthor: " + Author;	//return the message w/ "toString" in Book class + string "Author"
	}
	
	public void show()	//create a method	
	{
		System.out.println("<<<History>>>" + this.toString());	//print out the message w/ "toString" of the class
	}
	
}

