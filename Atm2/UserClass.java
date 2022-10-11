package Atm2;

public class UserClass {//creating user constructor to add the suer name etc
	
		private String UserName;
		private String UserATMNumber;
		private String UserPassword;
		private int Balance;
		private String Banktype;
	
		

	 UserClass(String UserName,String UserATMNumber,String UserPassword,int Balance,String Banktype) {
		this.UserName=UserName;
		this.UserATMNumber=UserATMNumber;
		this.UserPassword=UserPassword;
		this.Balance=Balance;
		this.Banktype=Banktype;
		
	
}
	 //getter and setter

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserATMNumber() {
		return UserATMNumber;
	}

	public void setUserATMNumber(String userATMNumber) {
		UserATMNumber = userATMNumber;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public String getBanktype() {
		return Banktype;
	}

	public void setBanktype(String banktype) {
		Banktype = banktype;
	}

	@Override
	public String toString() {
		return "UserClass [UserName=" + UserName + ", UserATMNumber=" + UserATMNumber + ", UserPassword=" + UserPassword
				+ ", Balance=" + Balance + ", Banktype=" + Banktype + "]";
	}

	

	
	 
}