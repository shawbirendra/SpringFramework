package com.training.aop.service;

import com.training.aop.model.CAAccount;
import com.training.aop.model.SBAccount;

public class BankingService {
	private SBAccount sbAccount;
	private CAAccount caAccount;

	public BankingService() {
		// TODO Auto-generated constructor stub
	}

	public SBAccount getSbAccount() {
		return sbAccount;
	}

	public void setSbAccount(SBAccount sbAccount) {
		this.sbAccount = sbAccount;
	}

	public CAAccount getCaAccount() {
		return caAccount;
	}

	public void setCaAccount(CAAccount caAccount) {
		this.caAccount = caAccount;
	}

	@Override
	public String toString() {
		return "BankingService [sbAccount=" + sbAccount + ", caAccount=" + caAccount + "]";
	}

	public BankingService(SBAccount sbAccount, CAAccount caAccount) {
		super();
		this.sbAccount = sbAccount;
		this.caAccount = caAccount;
	}

	public String setAndGet(String name) {
		return "Hello Mr/Ms/MRs "+name;
	}
	
	public void checkNegative(int a) {
		if(a<0) {
			throw new RuntimeException(a+" : Negative Val not allowed...");
		}
	}
}
