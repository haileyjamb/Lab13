package edu.handong.csee.java.lab13.prob4;

public class Animal {	//create a super class

	private String name;	//declare a string
	
	public void setName(String name)	//create a method w/ parameter string
	{
		this.name = name;	//properties of name is equal to the property of parameter name
	}
	
	public void getName()	//declare a method
	{
		System.out.println("Name: " + name);	//print out the message w/ string "name"
	}
}
