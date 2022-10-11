package Atm2;

import java.util.Scanner;



public class DeopistCLass extends DisplayBalance{//Main Class Extends Abstract Class ,which that includes method called display ,which going to display the balance 
	Scanner inputreader=new Scanner(System.in);//Getting scanner ,for taking input from  the user
	public void deposit(UserClass user){//creating method deposit,in that going to pass Userclass and creating object for that
        System.out.println("Deposit");
        System.out.print("Enter amount");
        int inputamount=inputreader.nextInt();//getting input amount from the use to deposit in the main balance
        user.setBalance(user.getBalance()+inputamount);//adding the amount + input amount to balance to store in it
       
        System.out.println("Amount added Successfully");
        display(user.getBalance());//displaying the balance ,this is called from the DisplayBalance class 
        inputreader.nextLine();//to go for next menu,we need to press something
       
    }

	


}
