package Atm2;

import java.util.ArrayList;
import java.util.Scanner;



public class SwipeShoppingClass extends DisplayBalance{//Main Class Extends Abstract Class ,which that includes method called display ,which going to display the balance 
	
	
	 private static Scanner scannerobject=new Scanner(System.in);//getting the scanner for the user input

	  public static void SwipeShooping(UserClass user){//creating the method to access the swipeshopping process
		 
	  
		  
		
		
	        if(user.getBanktype().equals("SavingAccount"))//checking the condition wheather the user contains saving account or not
	        		
	        { 
	        	
	        	int swipeamount= scannerobject.nextInt();//crating variable to get the amount from the user
	            
	       for(int i=0;i<user.getUserName().length();i++) {
	    	   
	       
					
					if(user.getBalance() >= swipeamount)  //getting the balance amount from the user through user object and checking the condition ,wheather it is greater than user input amount
					{  
						
					
					user.setBalance((user.getBalance()-swipeamount)+20);//creaditing the amount from the balance adding the cashback of 1per or 20ruppes
				
					
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
	        
	    }

	  }
}
