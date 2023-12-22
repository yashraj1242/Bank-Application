package com.abstractInterface;

public class LoanAccount implements Account{
	final static long account_Number=786765786578L;
	double totalBalance=100000;
	double target_amount=500000;
	@Override
	public void withdraw(double amount) {
		 String action="CREDITED";
		 if (totalBalance+amount<=target_amount) {
			totalBalance=totalBalance+amount;
			displayMessage(action, amount);
		} else {
           System.err.println("your Exceeding Your Target....check your target amount");
		}
	}

	@Override
	public void deposite(double amount) {
		String action="DEBITED";
		if (amount<=150000) {
			totalBalance=totalBalance-amount;
			displayMessage(action, amount);
		} else {
            System.err.println("pay based on the limit ....as bank guidence");
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
