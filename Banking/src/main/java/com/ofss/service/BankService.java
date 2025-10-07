package com.ofss.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.ofss.model.Bank;
import com.ofss.model.BankRepository;
@Service
public class BankService {
	@Autowired
	private BankRepository bankRepository;
	
	public ResponseEntity<Object> addABank(Bank bank){
		// Saves a given entity. Use the returned instance for further
		// operations as the save operation might have changed theentity instance completely.
		// save() method will generate required INSERT query
		bankRepository.save(bank);
		return ResponseEntity.ok("Bank added successfully!");
	}
	
	public List<Bank> listBanks() {
		ArrayList<Bank> allBanks=new ArrayList<>();
		bankRepository.findAll().forEach(bank -> allBanks.add(bank));
		return allBanks;
	}
}