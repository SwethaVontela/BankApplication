package com.web.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.Model.Bank;
import com.web.Model.Bank1;
import com.web.Service.BankServiceImp;

@Controller
public class BankController{
	@Autowired
	private BankServiceImp service;
	@RequestMapping("/")
	public String homepage()
	{
		return"home";
	}
	@RequestMapping("/account")
	public String account()
	{
		return"account";
	}
	@RequestMapping("/register")
	public String save(Bank bank,ModelMap model)
	{
		Bank b=service.saveBank(bank);
		return "success";
	}
	@RequestMapping("/balance")
	public String balance()
	{
	
		return"balance";
	}
	@RequestMapping("/bal")
	public String getOne(ModelMap model,long accountno)
	{
		model.put("Banks",service.getBank(accountno));
		return"viewbalance";
	}
	@RequestMapping("/deposit")
	public String deposit()
	{
		return "deposit";
	}
	@RequestMapping("/add")
	public String updateac(ModelMap model,Bank bank,Bank1 bank1)
	{
		model.put("Banks",service.updateBank(bank, bank1));
		return "msg";
	}
	@RequestMapping("/withdraw")
	public String withdraw()
	{
		return "withdraw";
	}
	@RequestMapping("/sub")
	public String updatewithdraw(ModelMap model, Bank bank, Bank1 bank1)
	{
		model.put("Banks", service.updateWithdraw(bank, bank1));
		return "msg1";
	}
	@RequestMapping("/transfer")
	public String transfer()
	{
		return "transfer";
	}
	@RequestMapping("/change")
	public String updatetransfer(ModelMap model,Bank bank,Bank1 bank1)
	{
		model.put("Banks",service.updateTransfer(bank, bank1));
		return "msg2";
	}
	@RequestMapping("/close")
	public String close() {
		return "close";
	}
	@RequestMapping("/closeac")
	public String closeac(ModelMap model,Bank bank, Bank1 bank1)
	{
		model.put("Banks", service.closeAccount(bank, bank1));
		return "msg3";
	}
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	@RequestMapping("/edit/{accountno}")
	public String update(@PathVariable long accountno,ModelMap model)
	{
		model.put("command", service.getBank(accountno));
		return "edit";
	}
	@RequestMapping("/editu")
	public String updatesave(Bank bank,Bank1 bank1, ModelMap model)
	{
		Bank edit=service.updateEdit(bank, bank1);
		return "msg4";
	}
	
}
