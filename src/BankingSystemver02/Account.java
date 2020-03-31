package BankingSystemver02;

import java.util.Random;
import java.util.Scanner;

public class Account implements CustomSpecialRate {

	String bankOwner,bankAccount;
	int bankBalance;
	
	public Account(String account, String name) {

		bankAccount=account;
		bankOwner=name;
		bankBalance=1000;

	}


	public int rateWithSave(int saveMoney) {
		bankBalance = (int)(bankBalance+bankBalance+defaultRate+saveMoney);
	}
	
	
	

	public void AccountInfo() {

		System.out.println("-----------------");
		System.out.println("계좌번호>"+bankAccount);
		System.out.println("고객이름>" + bankOwner);
		System.out.println("잔    고>" + bankBalance);
		
	}

}
