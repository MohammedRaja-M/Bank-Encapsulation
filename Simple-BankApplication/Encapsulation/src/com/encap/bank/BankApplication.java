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
