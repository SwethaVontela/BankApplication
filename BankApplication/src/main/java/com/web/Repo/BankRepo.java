package com.web.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.Model.Bank;
@Repository
public interface BankRepo extends CrudRepository<Bank, Long> {
	
}
