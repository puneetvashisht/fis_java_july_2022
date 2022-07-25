package com.fis.day03.colls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestBank {

	private static Map<String, Bank> bankMap;

	public static void main(String[] args) {
		
		Atm atm_icici_1 = new Atm(23, "GK", "Delhi", 3343400l, true);
		Atm atm_icici_2 = new Atm(213, "Hinjawadi", "Pune", 4000000, true);
		Atm atm_icici_3 = new Atm(2133, "Baner", "Pune", 4000000, false);
		
		List<Atm> atms_icici = new ArrayList<>();
		atms_icici.add(atm_icici_1);
		atms_icici.add(atm_icici_2);
		
		Branch branch_icici_1 = new Branch(23, "GK", "Delhi", "ICIC0000234", null);
		Branch branch_icici_2 = new Branch(2133, "Baner", "Pune", "ICIC000023", atm_icici_3);
		
		List<Branch> branches_icici = new ArrayList<>();
		branches_icici.add(branch_icici_1);
		branches_icici.add(branch_icici_2);
		
		Bank icici_bank = new Bank(1, "ICICI", branches_icici, atms_icici);
		
		
		System.out.println(icici_bank);
		
		bankMap = new HashMap<>();
		bankMap.put("icici", icici_bank);
		

	}
	
	// all the branches & atms of a bank "hdfc", "icici"
	
	public static List<Branch> findBankBranches(String bankName){
		Bank bank = bankMap.get(bankName);
		return bank.getBranches();
	}
	// all operationa atms of a bank
	// all branches of bank starting with "delhi"
	// which atms can disp amount exeeding a certian range

}
