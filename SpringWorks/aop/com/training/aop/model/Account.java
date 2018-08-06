package com.training.aop.model;

public class Account {
	private int accNo;
	private String accName;
	private double balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
	}

	public Account(int accNo, String accName, double balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}

	public int getAccNo() {
		System.out.println("Account.getAccNo()");
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		System.out.println("Account.getAccName()");
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		System.out.println("Account.getBalance()");
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
