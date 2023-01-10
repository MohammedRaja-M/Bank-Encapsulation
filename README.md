# Bank-Encapsulation

package com.encap.bank;

public class BankApplication {


	private String Acc_Holder_Name = "MohamedRaja";
	private double balance = 10000;
	private long Ph_no = 9877645323l;
	private String ifse_code = "00965784";
	
	public String getAcc_Holder_Name(){
		return Acc_Holder_Name;
	}
	public double getbalance() {
		return balance;
		
	}
	public long getPh_no() {
		return Ph_no;
	}
	public String getifse_code() {
		return ifse_code;
	}
	
	public void setPh_no(long Ph_no) {
		this.Ph_no = Ph_no;
	}
	public void setAcc_Holder_Name(String Acc_Holder_Name) {
		this.Acc_Holder_Name = Acc_Holder_Name;
	}
	

}
*******************************************************************************************************

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
