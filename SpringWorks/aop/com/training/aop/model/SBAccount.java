package com.training.aop.model;

public class SBAccount {
	private Account account;

	public SBAccount() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SBAccount [account=" + account + "]";
	}

	public Account getAccount() {
		System.out.println("SBAccount.getAccount()");
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
