package com.web.Model;

public class Bank1 {
	private double depositamt;
	private double withdrawamt;
	private double transferamt;
	private long transferacno;
	
	public Bank1() {
		super();
	}
	public Bank1(double depositamt, double withdrawamt, double transferamt, long transferacno) {
		super();
		this.depositamt = depositamt;
		this.withdrawamt = withdrawamt;
		this.transferamt = transferamt;
		this.transferacno = transferacno;
		
	}
	public double getDepositamt() {
		return depositamt;
	}
	public void setDepositamt(double depositamt) {
		this.depositamt = depositamt;
	}
	public double getWithdrawamt() {
		return withdrawamt;
	}
	public void setWithdrawamt(double withdrawamt) {
		this.withdrawamt = withdrawamt;
	}
	public double getTransferamt() {
		return transferamt;
	}
	public void setTransferamt(double transferamt) {
		this.transferamt = transferamt;
	}
	public long getTransferacno() {
		return transferacno;
	}
	public void setTransferacno(long transferacno) {
		this.transferacno = transferacno;
	}
	
	@Override
	public String toString() {
		return "Bank1 [depositamt=" + depositamt + ", withdrawamt=" + withdrawamt + ", transferamt=" + transferamt
				+ ", transferacno=" + transferacno + "]";
	}

	
}
