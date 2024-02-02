package com.web.Service;

import java.util.List;

import com.web.Model.Bank;
import com.web.Model.Bank1;

public interface BankService {   
	public Bank saveBank(Bank bank);
	public Bank getBank(long accountno);
	public List<Bank>getAllBank();
	public Bank updateBank(Bank bank,Bank1 bank1);
	public Bank updateWithdraw(Bank bank,Bank1 bank1);
	public Bank updateTransfer(Bank bank,Bank1 bank1);
	public Bank closeAccount(Bank bank,Bank1 bank1);
	public Bank updateEdit(Bank bank,Bank1 bank1);
	
}
