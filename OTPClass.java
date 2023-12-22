package com.abstractInterface;

import java.util.Random;

public class OTPClass {
	
	public static char[] otp()
	{
		int length=4;
		String numbers="0123456789";
		Random random=new Random();
		char otp[]=new char[length];
		for (int i = 0; i < otp.length; i++) {
			otp[i]=numbers.charAt(random.nextInt(numbers.length()));
		}
		return otp;
	}
  
}
