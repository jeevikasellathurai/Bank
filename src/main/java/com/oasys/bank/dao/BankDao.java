package com.oasys.bank.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.bank.repository.BankRepository;

@Repository
public class BankDao {
@Autowired
BankRepository bankrepo;
	public String getifsc(String branch) {
		
		return bankrepo.getifsc(branch);
	}

}
