package BankingSystemver02;

import java.util.Random;
import java.util.Scanner;

import BankingSystemver01.Account;

public class AccountManager {
	Account[] myCustomer;
	int numOfAccounts;

	public AccountManager(int size) {
		
		myCustomer = new Account[size];
		numOfAccounts=0;
	}
	
	public void showMenu() {

		System.out.println("---Menu---");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입   금");
		System.out.println("3. 출   금");
		System.out.println("4. 계좌정보출력");
		System.out.println("5. 프로그램 종료");

		while(true) {


			switch(scan.nextInt()) {
			case MenuChoice.Make : //계좌개설

				makeAccount();
				break;	

			case MenuChoice.Deposit://입금

				depositMoney();
				break;

			case MenuChoice.Withdraw://출금

				withdrawMoney();
				break;

			case MenuChoice.Inquire://전체계좌정보
				showAccountInfo();
				break;

			case MenuChoice.Exit://프로그램 종료
				System.exit(0);
				return;

			}
		}

	}
	public void makeAccount() {

		System.out.println("**신규계좌개설**");

		bankAccount=new Random().nextInt(99998)+1;
		System.out.println("고객이름: ");

		Scanner scan = new Scanner(System.in);
		bankName = scan.next();
		bankBalance= 1000;

		System.out.println("계좌번호: " + bankAccount);
		System.out.println("고객이름: " + bankName);
		System.out.println("잔액:    " + bankBalance);

		myCustomer[index++] = 
				new Account(bankAccount, bankName, bankBalance);
		System.out.println("계좌개설이 완료되었습니다.");
	}


	public void depositMoney() {
		System.out.println("**입  금**");
		System.out.print("계좌번호와 입금할 금액을 입력하세요:");
		inOutComp("입금");

	}

	public void withdrawMoney() {

		System.out.println("** 출   금**");
		System.out.println("계좌번호와 출금할 금액을 입력하세요:");
		inOutComp("출금");

	}

	private void showAccountInfo() {
		// TODO Auto-generated method stub

		System.out.println("계좌정보 전체를 출력합니다.");

		for(Account a: myCustomer) {
			if(a==null) break;

			System.out.printf("----\n"+"계좌번호: %s\n  고객이름: %s\n 잔액: %d\n "
					,a.bankAccount, a.bankName, a.bankBalance);
		}
		System.out.println("계좌정보가 출력되었습니다.");

	}

	public void inOutComp(String in_out) {
		System.out.println("계좌번호: ");
		int index=0;
		int account = scan.nextInt();
		boolean existAcc=false;

		for(; index <= myCustomer.length ; index++) {
			if(myCustomer[index].bankAccount==account) {
				existAcc=true;
				break;
			}
			else
				existAcc=false;
		}
		if(existAcc) {

			int balance;

			switch(in_out) {
			case "입금":
				System.out.println("입금액: ");
				balance = scan.nextInt();
				if(balance>0) {
					myCustomer[index].bankBalance += balance;
					System.out.println("입금이 되었습니다.");
				}
				else
					System.out.println("입금액이 0보다 작습니다.");
				break;

			case "출금":
				System.out.println("출금액: ");
				balance=scan.nextInt();
				if(balance<=myCustomer[index].bankBalance) {

					myCustomer[index].bankBalance-=balance;
					System.out.println("출금되었습니다.");

				}
				else
					System.out.println("잔고가 부족합니다.");
			}//switch
		}//if
		else
			System.out.println("해당계좌가 없습니다.");

	}
	
}
