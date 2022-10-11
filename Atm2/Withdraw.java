package Atm2;

import java.util.Scanner;

/*
 * here Single responsiblity priciple is used and Liskov principle (Because as the rule post condition says,need to call particular /nedded method to call
 */

public class Withdraw extends DisplayBalance {//Main Class Extends Abstract Class ,which that includes method called display ,which going to display the balance 
	
	public static void withdrawal(UserClass user){//creating the method for withdrawing purpose
    	Scanner inputreader=new Scanner(System.in);//Taking the input from the user
        if(user.getBanktype().equals("SavingAccount"))//if the user bank type is savingaccount ,the process will run
        { 
        	System.out.println("Please enter the withdrawal amount for tranaction");
        	int withdrawlamount= inputreader.nextInt();  //taking amount from the user to get money from the balance
            if(withdrawlamount%5==0) {//if the input amount is multiple of 5,then condition will pass and will got to the next condition
       for(int index=0;index<user.getUserName().length();index++) {
    	   
       
				
				if(user.getBalance() >= withdrawlamount)  //getting the balance from the user class through object and getting that.if the balance amount is greater than entered amount
				{  
					
				 if(withdrawlamount<100) {//if the entered amount is lesser than 100
				user.setBalance((user.getBalance() - (withdrawlamount))-20); //need to add tax for the user with 20ruppes or 2per
				
				 }else if(withdrawlamount>=100) {//if the entered amount is greater than 100
					 user.setBalance((user.getBalance() - (withdrawlamount))-60); //need to add tax for the user with 60ruppes or 4per
				 }
				  display(user.getBalance());//calling the class from the displaybalance,which is extended by this class
					
					break;
				 
				}  
				else  
				{  
				//show custom error message   
				System.out.println("Insufficient Balance");  
				}  
				System.out.println("");  
       }
        }else {
        	System.out.println("Please correct the amount of value. It should be multiple of USD 5 ");//if the input amount is not mulitple of 5,it will display
        }
    }

}
}
