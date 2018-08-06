package com.training.aop.model;

public class CAAccount {
	private Account account;

	public CAAccount() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SBAccount [account=" + account + "]";
	}

	public Account getAccount() {
		System.out.println("CAAccount.getAccount()");
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double showBalance() {
		System.out.println("CAAccount.showBalance()");
		return account.getBalance();
	}
	public void getTest() {
		System.out.println("CAAccount.getTest()");
	}
	public int getOneParam(int x) {
		System.out.println("CAAccount.getOneParam()");
		return 5;
	}
}
