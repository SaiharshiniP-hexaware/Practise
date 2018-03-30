package com.hexa.entity;

public class Account {
private int aid;
private String cname;
private double bal;
//this constructor is used by spring ioc for dependency injection.
public Account(int aid, String cname, double bal) {
	super();
	this.aid = aid;
	this.cname = cname;
	this.bal = bal;
}
public int getAid() {
	return aid;
}
public String getCname() {
	return cname;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return aid+" "+cname+" "+bal;


}
}
