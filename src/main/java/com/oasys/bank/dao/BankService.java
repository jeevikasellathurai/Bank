package com.oasys.bank.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
@Autowired
BankDao bankdao;
	public String getifsc(String branch) {
		return bankdao.getifsc(branch);
	}

}
