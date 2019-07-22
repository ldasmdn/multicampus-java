import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
	
	private static List<Account> list = new ArrayList<Account>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.이체|6.계좌삭제|7.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				transfer();
			} else if(selectNo == 6) {
				deleteAccount();
			} else if(selectNo == 7) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	// 계좌생성
	public static void createAccount() {
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		System.out.print("계좌주 : ");
		String owner = scanner.next();
		
		System.out.print("초기 입금액 : ");
		int initBalance = scanner.nextInt();
		
		if(findAccount(ano) != null) {
			System.out.println("이미 존재하는 계좌번호입니다.");
			return;
		}
		
		Account account = new Account(ano, owner, initBalance);
		list.add(account);
		System.out.println("\n계좌 생성이 완료되었습니다.\n");
		
	}
	
	// 계좌목록
	public static void accountList() {
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\n계좌 목록이 조회되었습니다.\n");
		
		
	}
	
	// 예금
	public static void deposit() {
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		System.out.print("입금액 : ");
		int amount = scanner.nextInt();
		
		// ano 값을 계좌번호로 갖는 account 객체를 찾아서
		// 해당 객체의 balance 값에 amount 만큼 추가하고 다시 balance에 저장
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return;
		}
		
		// account.setBalance(account.getBalance() + amount);
		int balance = account.getBalance();
		balance += amount;
		account.setBalance(balance);
		
		System.out.println("\n입금이 완료되었습니다.\n");

	}
	
	// 출금
	public static void withdraw() {
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		System.out.print("출금액 : ");
		int amount = scanner.nextInt();
		
		// ano 값을 계좌번호로 갖는 account 객체를 찾아서
		// 해당 객체의 balance 값에 amount 만큼 차감하고 다시 balance에 저장
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return;
		}
		
		// account.setBalance(account.getBalance() - amount);
		int balance = account.getBalance();
		balance -= amount;
		account.setBalance(balance);
		
		System.out.println("\n출금이 완료되었습니다.\n");
		
	}
	
	// 계좌 찾기
	public static Account findAccount(String ano) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getAno().equals(ano)) {
				return list.get(i);
			}
		}
		return null;
	}
	
	// 이체
	public static void transfer() {
		
		System.out.print("출금 계좌 : ");
		String sAno = scanner.next();
		Account sAccount = findAccount(sAno);
		if(sAccount == null) {
			System.out.println("출금 계좌가 존재하지 않습니다.");
			return;
		}
		
		System.out.print("입금 계좌 : ");
		String rAno = scanner.next();
		Account rAccount = findAccount(rAno);
		if(rAccount == null) {
			System.out.println("입금 계좌가 존재하지 않습니다.");
			return;
		}
		
		System.out.print("이체금액 : ");
		int amount = scanner.nextInt();
		
		sAccount.setBalance(sAccount.getBalance() - amount);
		rAccount.setBalance(rAccount.getBalance() + amount);
		
		System.out.println("\n이체가 완료되었습니다.\n");
		
	}
	
	// 계좌 삭제
	public static void deleteAccount() {
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		Account account = findAccount(ano); 
		if(account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return;
		}
		list.remove(account);
		System.out.println("\n계좌 삭제가 완료되었습니다.\n");
	}
	
}
