package edu.handong.csee.java.lab13.prob1;

public class Main {	//create a main class

	public static void main(String[] args)
	{
		Friend friend1 = new Friend();	//create an object of class "Friend"
		
		SchoolFriend friend2 = new SchoolFriend();	//create an object of class "SchoolFriend"
		
		ClassFriend friend3 = new ClassFriend();	//create an object of class "ClassFriend"
		

		InstanceOf.whatFriend(friend1);	//put friend1 object in whatFriend method
		
		InstanceOf.whatFriend(friend2);	//put friend2 object in whatFriend method
		
		InstanceOf.whatFriend(friend3);	//put friend3 object in whatFriend method
		
	}
}
