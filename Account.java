package com.jsp.interfaces;


interface Bank
{
	public  void deposit(double Amt);
	public  void withdraw(double Amt);
	public  void displayDetails();
}

class Customer 
{
	 String Name;
	 long   Ac_No;
	 String EmailId;
	 long   Ph_No;
	 String IFSC;
	 double Balance;
	 static String Bank_Name="Indian Bank";
	 final String Branch_Name="Hsr Layout";
	
	 // Intilize the data members within the interface concepets
	public Customer(String Name,long Ac_No,String EmailId,long Ph_No,String IFSC) 
	{
	  this.Name=Name;
	  this.Ac_No=Ac_No;
	  this.EmailId= EmailId;
	  this.Ph_No=Ph_No;
	  this.IFSC = IFSC;
	}
	
	// Geter Methods 
	public String getName() 
	{
		return Name;
	}
	public long getAc_No() 
	{
		return Ac_No;
	}
	public String getEmailId() 
	{
		return EmailId;
	}
	public long getPh_No() 
	{
		return Ph_No;
	}
	public String getIFSC() 
	{
		return IFSC;
	}
	public double getBalance() 
	{
		return Balance;
	}
	
	// Setter Methods 
	public void setName(String Name) 
	{
		this.Name=Name;
	}
	public void setAc_No(long Ac_No) 
	{
		this.Ac_No=Ac_No;
	}
	public void setEmailId(String EmailId) 
	{
		this.EmailId=EmailId;
	}
	public void setPh_No(long Ph_No) 
	{
		this.Ph_No=Ph_No;
	}
	public void setIFSC(String IFSC) 
	{
		this.IFSC=IFSC;
	}
	public void setBalance(double Balance) 
	{
		this.Balance=Balance;
	}
}

// CURRENT ACCOUNT USING INTERFACE CONCEPTES..
class CurrentAccount extends Customer implements Bank
{
	private final double MinimumBalance = 1500.0;
	
	public CurrentAccount(String Name,long Ac_No,String EmailId,long Ph_No,String IFSC) 
	{
		super(Name,Ac_No,EmailId,Ph_No,IFSC);
		
	}
	@Override
	public void withdraw(double Amt) 
	{
		if(Amt>=0 && getBalance() - MinimumBalance>=Amt)
		{
			Balance = getBalance()-Amt;
			System.out.println("WithDraw Amount : "+Amt);
		}else
			{
				System.out.println("Invalid Amount");
			}
	}
	@Override
	public void deposit(double Amt) 
	{
		if(Amt>=0)
		{
			Balance=getBalance()+Amt;
			System.out.println("Deposti Amount : "+Amt);
		}else
			{
				System.out.println("Invalid Amount");
			}		
	}
	
	@Override
	public void displayDetails() 
	{
		System.out.println("Current Account Transcation");
		System.out.println("---------------------");
		System.out.println("Owner Name : "+Name);
		System.out.println("Account No : "+Ac_No);
		System.out.println("Email Id : "+EmailId);
		System.out.println("Phone No : "+Ph_No);
		System.out.println("IFSC Code : "+IFSC);
		System.out.println("Check Balance : "+Balance);
		System.out.println("Bank Name : "+Bank_Name);
		System.out.println("Branch Name : "+Branch_Name);
		System.out.println("-------*****----------");		
	}
}

// SAVINGS ACCOUNT CLASS USING INTERFACE CONCEPTES...
class SavingsAccount extends Customer implements Bank
{
	public SavingsAccount(String Name,long Ac_No,String EmailId,long Ph_No,String IFSC) 
	{
		super(Name,Ac_No,EmailId,Ph_No,IFSC);
	}
	@Override
	public void withdraw(double Amt) 
	{
		if(Amt>=0 && Balance>=Amt)
		{
			Balance = Balance-Amt;
			System.out.println("WithDraw Amount : "+Amt);
		}else
			{
				System.out.println("Invalid Amount");
			}
	}
	@Override
	public void deposit(double Amt) 
	{
		if(Amt>=0)
		{
			Balance=getBalance()+Amt;
			System.out.println("Deposti Amount : "+Amt);
		}else
			{
				System.out.println("Invalid Amount");
			}		
	}
	
	@Override
	public void displayDetails() 
	{
		System.out.println("Savings Account Transcation");
		System.out.println("---------------------");
		System.out.println("Owner Name : "+Name);
		System.out.println("Account No : "+Ac_No);
		System.out.println("Email Id : "+EmailId);
		System.out.println("Phone No : "+Ph_No);
		System.out.println("IFSC Code : "+IFSC);
		System.out.println("Check Balance : "+Balance);
		System.out.println("Bank Name : "+Bank_Name);
		System.out.println("Branch Name : "+Branch_Name);
		System.out.println("-------*****----------");	
	}
	
}

public class Account 
{

	public static void main(String[] args) 
	{
		// Savings Account Object Creations
		SavingsAccount savings = new SavingsAccount("Madesh", 6448979107l, "madesh@gmail.com", 9876543210l, "IFSC000056");  
		               savings.setBalance(2000.0);
		               savings.deposit(199.0);
		               savings.withdraw(200.0);
		               savings.displayDetails();

		// Current Account Object Creations
		CurrentAccount current = new CurrentAccount("Madesh", 6448979107l, "madesh@gmail.com", 9876543210l, "IFSC000056");
		               current.setBalance(2000.0);
		               current.deposit(199.0);
		               current.withdraw(500.0);
		               current.displayDetails();
	}

}
