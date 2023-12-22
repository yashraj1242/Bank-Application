package com.abstractInterface;

public class SavingAccount implements Account{
    final static long account_Number=565657864676L;
    double totalBalance=2500;
    
	@Override
	public void withdraw(double amount) {
		String action="DEBITED";
		if (totalBalance>=amount) {
			totalBalance=totalBalance-amount;
			displayMessage(action, amount);
			
		} else {
           System.err.println("Insuffiecient Fund");
		}
	}

	@Override
	public void deposite(double amount) {
		String action="CREDITED";
		if (amount<=100000) {
			totalBalance=totalBalance+amount;
			displayMessage(action, amount);
		} else {
           System.err.println("Your Exceeding the limit");
		}
	}

	@Override
	public void balanceEnquiry() {
		System.out.println("TotalBalance is:"+totalBalance);
	}

	@Override
	public void displayMessage(String action,double amount) {
		System.out.println("The account number "+account_Number
		+" and the amount is "+ action+" the amount is "+amount+ " Total Balance is "
				+totalBalance+" from "+" Hyderbad Bank ..... at"+" 12Am 02/12/2023"
						+ "visit again@@@");	
	}

}
