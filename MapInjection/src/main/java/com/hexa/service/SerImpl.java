package com.hexa.service;

import com.hexa.dao.Idao;
import com.hexa.entity.Account;

public class SerImpl implements Iser {
	private Idao dao;

	// setter for IOC to do DI
	public void setDao(Idao dao) {
		this.dao = dao;
	}

	@Override
	public boolean transferFund(int from, int to, double amt) {
		Account acc1 = dao.getaccount(from);
		Account acc2 = dao.getaccount(to);
		if (acc1 == null || acc2 == null)
			return false;
		if (acc1.getBal() < amt)
			return false;
		acc1.setBal(acc1.getBal() - amt);
		acc2.setBal(acc2.getBal() + amt);
		return true;
	}

}
