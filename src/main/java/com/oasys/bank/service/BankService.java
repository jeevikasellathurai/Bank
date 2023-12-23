package com.oasys.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.bank.dao.BankDao;

@Service
public class BankService {
@Autowired
BankDao bankdao;
	public String getifsc(String branch) {
		return bankdao.getifsc(branch);
	}

}
