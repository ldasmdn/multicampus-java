import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
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
		
		// 아래 코드를 수행하기 전에 findAccount 함수에 ano 값을 넣어서
		// 리턴 값이 null인 경우에만 수행하고 아닌 경우에 이미 존재하는 계좌번호입니다 출력
		Account accountValidation = findAccount(ano);
		if(accountValidation != null) {
			System.out.println("이미 존재하는 계좌번호 입니다.");
			return;
		}
		
		Account account = new Account(ano, owner, initBalance); // 생성자 실행 시 numOfAccounts 증가
		System.out.println("[numOfAccounts] : " + Account.getNumOfAccounts());
		accountArray[Account.getNumOfAccounts()-1] = account; // numOfAccounts를 1 감소 시켜 배열 인덱스 맞추기
		
		System.out.println("\n계좌 생성이 완료되었습니다.\n");
		
	}
	
	// 계좌목록
	public static void accountList() {
		
		for(int i=0; i<Account.getNumOfAccounts(); i++) {
			System.out.println(accountArray[i]);
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
		
		for(int i=0; i<Account.getNumOfAccounts(); i++) {
			if(ano.equals(accountArray[i].getAno())) {
				return accountArray[i];
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
		
		if(findAccount(ano) == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return;
		}
		
		// 삭제하는 계좌번호에 해당하는 객체를 참조하고 있는 참조변수를 마지막 객체를 방금 삭제한 위치에 참조 시킴
		// 총 객체의 갯수를 저장하는 numOfAccounts를 1 감소 시킴
		for(int i=0; i<Account.getNumOfAccounts(); i++) {
			if(accountArray[i].getAno().equals(ano)) {
				accountArray[i] = accountArray[Account.getNumOfAccounts()-1];
				Account.decreaseNumOfAccounts();
				
				System.out.println("\n계좌 삭제가 완료되었습니다.\n");
				
				return;
			}
		}

	}
}
