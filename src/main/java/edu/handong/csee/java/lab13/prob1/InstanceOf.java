package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {	//create a class "InstanceOf"

	public static void whatFriend(Friend friend)	//a method that checks types
	{
		if(friend instanceof ClassFriend)	//if a type of friend object equals ClassFriend
			
			((ClassFriend) friend).classFriend();	//then, go to classFriend
		
		else if(friend instanceof SchoolFriend)		//if a type of friend object equals SchoolFriend
			
			((SchoolFriend) friend).schoolFriend();		//then, go to schoolFriend
		
		else	//else
			
			friend.justFriend();	//the, go to justFriend
	}
}
