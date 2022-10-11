package Atm2;

import java.util.Scanner;


public class LogicClass {
	private static Scanner sc=new Scanner(System.in);//Getting scanner ,for taking input from  the user

	static Withdraw withobject=new Withdraw();//creating object for withdraw class,to access that class methods
	static SwipeShoppingClass swipeobject=new SwipeShoppingClass();//creating object for swipeobject class,to access that class methods
	static DeopistCLass depoobject=new DeopistCLass();//creating object for deopistclsss class,to access that class methods
	
public static void logged(UserClass user){//creating the method and passing the user data to access that data
	
 
  t:  while(true)//checking the condition
    {
        System.out.println(" \n");
        System.out.print("1.Balance\n2.Withdrawal\n3.Swipe\n4.Deposit\n5.Exit\nEnter Choice: ");//displaying the methods that user can access
        int choice=sc.nextInt();//from display ,going to  choosing the class to run the method.
        sc.nextLine();
       
        switch(choice)
        {
            case 1://case 1 condition
                System.out.println("Balance: "+user.getBalance());//display the available balance in the that particular user
                System.out.print("Press Enter to Continue...");
                sc.nextLine();
                break;
            case 2:
            	withobject.withdrawal(user);//invoking the class withdrawal methods
                break;
            
            case 3:
            	swipeobject.SwipeShooping(user);//invoking the swipe class methods
                break;
            
            case 4:
            	depoobject.deposit(user);//invoking the deposit class methods
                break;
            case 5:
                break t;//to break the loop
            default:
                System.out.println("Invalid Input");
        }
      
    }
}

}
