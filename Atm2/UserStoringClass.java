package Atm2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class UserStoringClass {
	@SuppressWarnings("unchecked")
	
		Scanner s=new Scanner(System.in);
		// UserClass(String UserName,String UserATMNumber,String UserPassword)
	/*
	 * Adding the details to the user for storing the data
	 */
		static UserClass Person1=new UserClass("Shabarish","109290120189","6122",1000,"SavingAccount");
		static UserClass Person2=new UserClass("Ramesh","8672877377","1267",500,"SavingAccount");
		static UserClass Person3=new UserClass("AbinYA","72369876267","1011",3000,"SavingAccount");
		static UserClass Person4=new UserClass("Vasanth","989767899877","1928",1000,"SavingAccount");
		
		/*
		 * stored data will added to arralist to access the data for the process
		 */
		static ArrayList<UserClass> Arraylistobject = new ArrayList<>();//creating arraylist and 
		static ArrayList<UserClass> addlist() {//creating the method for accesing the method in another class
			
			/*
			 * Adding the persons
			 */
		Arraylistobject.add(Person1);
		Arraylistobject.add(Person2);
		Arraylistobject.add(Person3);
		Arraylistobject.add(Person4);
		return Arraylistobject;
		}
		
		
		
		
		
	
}
