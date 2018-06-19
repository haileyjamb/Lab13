package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {	//create a class based on a super class "Book"
	
	private String publisher;	//declare a string "publisher"
	
	public Science(String Name, String Publisher)	//create a method w/ parameter "Name" + "Publisher"
	{
		super(Name);	//bring the constructor in parent class which is "Book"
		
		this.publisher = Publisher;	//properties of "publisher" is the same as a parameter string "Publisher"
	}
	
	public String toString()	//create a method
	{
		return super.toString() + "\n\tPublisher: " + publisher;	//return the message w/ "toString" of the super class + string "publisher"
	}
	
	public void show()	//create a method	
	{
		System.out.println("<<<Science>>>" + this.toString());	//print out the message w/ "toString" of the class
	}
}
