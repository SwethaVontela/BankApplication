package com.web.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	private long accountno;
	private String name;
	private String password;
	private double balance;
	private String address;
	private long mobileno;
	private int status;
	public Bank() {
		super();
	}
	public Bank(long accountno, String name, String password, double balance, String address, long mobileno,
			int status) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.password = password;
		this.balance = balance;
		this.address = address;
		this.mobileno = mobileno;
		this.status = status;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Bank [accountno=" + accountno + ", name=" + name + ", password=" + password + ", balance=" + balance
				+ ", address=" + address + ", mobileno=" + mobileno + ", status=" + status + "]";
	}

	
	
}
