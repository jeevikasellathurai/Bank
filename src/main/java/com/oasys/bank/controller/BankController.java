package com.oasys.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.bank.service.BankService;

@RestController
@RequestMapping(value = "/Bank")
public class BankController {
	@Autowired
	BankService bankser;

	@GetMapping(value = "/getifsc/{branch}")
	public String getifsc(@PathVariable String branch) {
		return bankser.getifsc(branch);
	}
}
