package com.MultiThread;

import java.util.Date;

public class Bank extends Thread
{
	static private int bal =70000;
	static private int cbal;
	static private int dbal;

	
	
	@Override
	public void run()
	{
		System.out.println("Your Current Balance is = "+ bal);
		for(int i=0;i<10;i++)
		{
		Date d = new Date(); 
		Credit(4000); // credit method 
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			System.out.println("Your A/c No xx 0380 credited by INR "+cbal+", on "+d.toLocaleString()+", with UPI PRN:"+Math.random()+". A/c Bal is INR "+bal+",  CR-UNIONBANK");
		}
		for(int i =0;i<25;i++) {
			Date d1 = new Date();
		withdraw(500); // debit method
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Your A/c No xx 0380 debited by INR "+dbal+", on "+d1.toLocaleString()+", with UPI PRN:"+Math.random()+". A/c Bal is INR "+bal+",  CR-UNIONBANK");
		}
	}
	static private void withdraw(int amt)
	{
		dbal = amt;
		 if (bal>500) {
		 bal = bal -amt;
		 //System.out.println("Remaining balance is ="+ bal);
		 }
		 else
		 {
			 System.out.println("insuficient Funds....!");
		 }
	}
	static private void Credit(int credit_amt)
	{
		 cbal = credit_amt;
		bal = bal+credit_amt;
	}
}