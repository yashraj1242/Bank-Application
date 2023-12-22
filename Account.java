package com.abstractInterface;

public interface Account {
   public void withdraw(double amount);
   public void deposite(double amount);
   public void balanceEnquiry();
   public void displayMessage(String action,double amount);
}
