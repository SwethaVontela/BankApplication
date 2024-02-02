package com.web.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Model.Bank;
import com.web.Model.Bank1;
import com.web.Repo.BankRepo;
@Service
public class BankServiceImp implements BankService {
@Autowired
private BankRepo repo;
	@Override
	public Bank saveBank(Bank bank) {
		
		return repo.save(bank);
	}
	public Bank getBank(long accountno) {
	
			Bank getOne=repo.findById(accountno).orElse(null);
			return getOne;
		}
	public List<Bank>getAllBank(){
	List<Bank>banklist=(List<Bank>) repo.findAll();
	return banklist;
	}
	@Override
	public Bank updateBank(Bank bank,Bank1 bank1)
	{
		
		Optional<Bank> existdata=repo.findById(bank.getAccountno());
		Bank existapp=existdata.get();
		existapp.setBalance(existapp.getBalance()+bank1.getDepositamt());
		return repo.save(existapp);
	}
	@Override
	public Bank updateWithdraw(Bank bank,Bank1 bank1)
	{
		
		Optional<Bank> existdata=repo.findById(bank.getAccountno());
		Bank existapp=existdata.get();
		if(existapp.getBalance()<bank1.getWithdrawamt()) {
			System.out.println("In sufficient balance");
		}
		else {
		existapp.setBalance(existapp.getBalance()-bank1.getWithdrawamt());
		}
		return repo.save(existapp);
	}
	@Override
	public Bank updateTransfer(Bank bank,Bank1 bank1)
	{
		Optional<Bank> record=repo.findById(bank.getAccountno());
		Bank obj=record.get();
		obj.setBalance(obj.getBalance()-bank1.getTransferamt());
		repo.save(obj);
		Optional<Bank> record2=repo.findById(bank1.getTransferacno());
		Bank obj1=record2.get();
		obj1.setBalance(obj1.getBalance()+bank1.getTransferamt());
		return repo.save(obj1);
	}
	@Override
	public Bank closeAccount(Bank bank,Bank1 bank1)
	{
		Optional<Bank> allrecords=repo.findById(bank.getAccountno());
		Bank onerecord=allrecords.get();
		int active=onerecord.getStatus();
		if(active==1) {
			onerecord.setStatus(0);
		}
		else {
			onerecord.setStatus(1);
		}
		return repo.save(onerecord);
	}
	public Bank updateEdit(Bank bank,Bank1 bank1)
	{
		return repo.save(bank);
	}
	

}
