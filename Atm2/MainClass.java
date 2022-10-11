package Atm2;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Dependancy inversion principle
 */

public class MainClass {
	public static void main(String[] args) {
		Scanner inputreader=new Scanner(System.in);//Getting scanner ,for taking input from  the user
		System.out.println("Enter the user name");
		String name=inputreader.next();//enetering the name from the user
		ArrayList<UserClass> Arrayobject = UserStoringClass.addlist();//creating object for arraylist ,which will call from the user
		 for(UserClass object:Arrayobject) {
			 
			   if(object.getUserName().equals(name)) {//if the user input name is present in the user data,then it will processed for next task
				   System.out.println("USer name is there,please provide password");//after the checking the user name ,if the username contains in data ,next it will ask for password
				   String password=inputreader.next();//getting the input from the user and checking in the database
				   if(object.getUserPassword().equals(password)) {//if the user password is equal to the present password
					
					   LogicClass.logged(object);//if condition pass ,it will go to the logiclass
					   break;
				   }else {
					   System.out.println("Please enter ctrt password");
				   }
			   }else {
				   System.out.println("USer name doesn't exit or eenterede user name is not correct");
			   }
		   }
	}

}
