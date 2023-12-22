package com.abstractInterface;
import java.util.Scanner;
public class HydrabadBank {
    public static void main(String[] args) {
		
    	String holderName="RevanthReddy";
    	long mbno=7676786776L;
    	String panCard="BYE676TS";
    	int mPinNum=2736;
    	
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 4 digit pin number");
        int pinNum=scanner.nextInt();
        if (mPinNum==pinNum) {
			System.out.println("enter your Mobile number");
			long mbno1=scanner.nextLong();
			char[] otpNum=OTPClass.otp();
			  int otp2=Integer.parseInt(new String(otpNum));
			 System.out.println(otpNum);
			 System.out.println("enter the otp");
			 int confOtp=scanner.nextInt();
			//otp validation
			 if (otp2==confOtp) {
				 System.out.println("***************************");
				System.out.println(holderName+" welcome to HyderbadBank");
				System.out.println("*****************************");
				 System.out.println("1.SavingAccount");
				 System.out.println("2.LoanAccount");
				 System.out.println("select the account type");
				 int accountType=scanner.nextInt();
				 switch (accountType) {
				case 1: {
					System.out.println("*******************");
					        System.out.println("1.Withdraw");
					        System.out.println("2.Deposite");
					        System.out.println("3.BalanceEnquiry");
					System.out.println("---------------------------");
					        System.out.println("enter your choice");
					        int choice=scanner.nextInt();
					        SavingAccount account=new SavingAccount();
					        switch (choice) { 
							case 1: {
								      System.out.println("enter the amount");
								      double amount=scanner.nextDouble();
								       account.withdraw(amount);
							         }break;
							case 2: {
								      System.out.println("enter the amount");
							          double amount=scanner.nextDouble();
							          account.deposite(amount);
			
					                 }break;
							case 3: {
								     account.balanceEnquiry();
					                }break;
							default: System.err.println("you choosen wrong choice");
								
							}
				        } break;
				   //loan account
				case 2:{
					System.out.println("*******************");
			        System.out.println("1.Withdraw");
			        System.out.println("2.Deposite");
			        System.out.println("3.BalanceEnquiry");
			System.out.println("---------------------------");
			        System.out.println("enter your choice");
			        int choice=scanner.nextInt();
			        LoanAccount account=new LoanAccount();
			        switch (choice) { 
					case 1: {
						      System.out.println("enter the amount");
						      double amount=scanner.nextDouble();
						       account.withdraw(amount);
					         }break;
					case 2: {
						      System.out.println("enter the amount");
					          double amount=scanner.nextDouble();
					          account.deposite(amount);
	
			                 }break;
					case 3: {
						     account.balanceEnquiry();
			                }break;
					default: System.err.println("you choosen wrong choice");
						
					} 
			           }break;
				default:System.err.println("you have choosen wrong accounttype");
					
				}
			} else {
               System.out.println("You entered wrong otp number");
			}
			 
		} else {
           System.err.println("Invalid PinNumber");
		}
    	
	}
}
