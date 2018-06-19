package edu.handong.csee.java.lab13.prob2;

public class Main {	//create a main class
	
	public static void main(String[] args) {	//create a main method
		
		
		Book book = new Book("Simple Book");	//create an object of class "Book" that contains "Simple Book"
		
		Science science = new Science("Hello Physics!", "ScienceWorld"); // Name, Publisher 	//create an obejct of class "Science"
		
		History history1 = new History("What Is history?", "E.H.Carr" );//Name, Author			//create an object of class "History"
		History history2 = new History("The South Korea", "Judis");	//create an object of class "History"
		
		book.show();	//go to show() w/ an object "book"
		science.show();	//go to show() w/ an object "science"
		history1.show();	//go to show() w/ an object "history1"
		history2.show(); // go to show() w/ an object "history2"
	}
}
