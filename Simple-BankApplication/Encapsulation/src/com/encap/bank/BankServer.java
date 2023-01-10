package com.encap.bank;

public class BankServer {

	public static void main(String[] args) throws Exception{
		BankApplication bank = new BankApplication();
		
		System.out.println("********WELCOME TO THE PROMON BANK*********");
		Thread.sleep(3000);
		System.out.println("The Account Holder Name: "+bank.getAcc_Holder_Name());
		Thread.sleep(1000);
		System.out.println("The Bank Balance is: "+bank.getbalance());
		Thread.sleep(1000);
		System.out.println("The Bank IFSC code is: "+bank.getifse_code());
		Thread.sleep(1000);
		System.out.println("The Holder Phone Number Is: "+bank.getPh_no());
		
		Thread.sleep(3000);
		System.out.println("HI..Your Name and Phone Number Will be Updated...!Thanksyou!");
		Thread.sleep(1000);
		bank.setPh_no(98843567);
		Thread.sleep(1000);
		System.out.println("The New Phone Number Is: "+bank.getPh_no());
		
		bank.setAcc_Holder_Name("Abdul Azeem");
		Thread.sleep(1000);
		System.out.println("The New Account Holder Name is: "+bank.getAcc_Holder_Name());

	}

}
