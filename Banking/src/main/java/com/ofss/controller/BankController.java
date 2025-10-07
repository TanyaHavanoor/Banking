package com.ofss.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ofss.model.Bank;
import com.ofss.service.BankService;
@RestController
public class BankController {
	@Autowired
	private BankService bankService;
	
	// API to add a bank
	// http://localhost:8184/banks
	// POST
	@RequestMapping(value="/banks", method=RequestMethod.GET)
	public ResponseEntity<Object> addABank(Bank bank) {
		return bankService.addABank(bank);
	}
	
	// API 2 to list all the banks
	@GetMapping("/banks")
	public List<Bank> listAllBanks() {
		return bankService.listBanks();
	}
}