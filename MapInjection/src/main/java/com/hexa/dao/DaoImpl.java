package com.hexa.dao;

import java.util.Map;

import com.hexa.entity.Account;

public class DaoImpl implements Idao {
	private Map<Integer, Account> amap;

	// setter for IOC to do DI
	public void setAmap(Map<Integer, Account> amap) {
		this.amap = amap;
	}

	@Override
	public Account getaccount(int aid) {
		return amap.get(aid);
	}

}
