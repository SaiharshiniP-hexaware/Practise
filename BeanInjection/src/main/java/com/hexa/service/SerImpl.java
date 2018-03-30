package com.hexa.service;

import com.hexa.dao.IDao;

public class SerImpl implements Iser {
	private IDao dao;
public SerImpl() {
	System.out.println("service constructor");
}
	// setter for spring IOC to do Dependency Injection.
	public void setDao(IDao dao) {
		System.out.println("dao is injected");
	
		this.dao = dao;
	}

	@Override
	public String getData() {

		return dao.viewData();
	}

}
