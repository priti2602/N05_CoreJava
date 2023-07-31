//Program to demonstrate on encapsulation
/* encapsulation achieves the data by hiding using private
  access specifiers*/
package org.tnsif.encapsulation;

public class HDFC {
	
    //private data members
	private long accounNo;
	private int cvvNo;
	private String accountType;
	private int pinNo;
	
	public long getAccounNo() {
		return accounNo;
	}
	public void setAccounNo(long accounNo) {
		this.accounNo = accounNo;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "HDFC [accounNo=" + accounNo + ", cvvNo=" + cvvNo + ", accountType=" + accountType + ", pinNo=" + pinNo
				+ ", getAccounNo()=" + getAccounNo() + ", getCvvNo()=" + getCvvNo() + ", getAccountType()="
				+ getAccountType() + ", getPinNo()=" + getPinNo() + "]";
	}
	
	
	

}
