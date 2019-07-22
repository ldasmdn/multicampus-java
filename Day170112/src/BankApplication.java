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
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.��ü|6.���»���|7.����");
			System.out.println("-------------------------------------------------");
			System.out.print("����> ");
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
		System.out.println("���α׷� ����");
	}
	
	// ���»���
	public static void createAccount() {
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		
		System.out.print("������ : ");
		String owner = scanner.next();
		
		System.out.print("�ʱ� �Աݾ� : ");
		int initBalance = scanner.nextInt();
		
		if(findAccount(ano) != null) {
			System.out.println("�̹� �����ϴ� ���¹�ȣ�Դϴ�.");
			return;
		}
		
		Account account = new Account(ano, owner, initBalance);
		list.add(account);
		System.out.println("\n���� ������ �Ϸ�Ǿ����ϴ�.\n");
		
	}
	
	// ���¸��
	public static void accountList() {
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\n���� ����� ��ȸ�Ǿ����ϴ�.\n");
		
		
	}
	
	// ����
	public static void deposit() {
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		
		System.out.print("�Աݾ� : ");
		int amount = scanner.nextInt();
		
		// ano ���� ���¹�ȣ�� ���� account ��ü�� ã�Ƽ�
		// �ش� ��ü�� balance ���� amount ��ŭ �߰��ϰ� �ٽ� balance�� ����
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
			return;
		}
		
		// account.setBalance(account.getBalance() + amount);
		int balance = account.getBalance();
		balance += amount;
		account.setBalance(balance);
		
		System.out.println("\n�Ա��� �Ϸ�Ǿ����ϴ�.\n");

	}
	
	// ���
	public static void withdraw() {
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		
		System.out.print("��ݾ� : ");
		int amount = scanner.nextInt();
		
		// ano ���� ���¹�ȣ�� ���� account ��ü�� ã�Ƽ�
		// �ش� ��ü�� balance ���� amount ��ŭ �����ϰ� �ٽ� balance�� ����
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
			return;
		}
		
		// account.setBalance(account.getBalance() - amount);
		int balance = account.getBalance();
		balance -= amount;
		account.setBalance(balance);
		
		System.out.println("\n����� �Ϸ�Ǿ����ϴ�.\n");
		
	}
	
	// ���� ã��
	public static Account findAccount(String ano) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getAno().equals(ano)) {
				return list.get(i);
			}
		}
		return null;
	}
	
	// ��ü
	public static void transfer() {
		
		System.out.print("��� ���� : ");
		String sAno = scanner.next();
		Account sAccount = findAccount(sAno);
		if(sAccount == null) {
			System.out.println("��� ���°� �������� �ʽ��ϴ�.");
			return;
		}
		
		System.out.print("�Ա� ���� : ");
		String rAno = scanner.next();
		Account rAccount = findAccount(rAno);
		if(rAccount == null) {
			System.out.println("�Ա� ���°� �������� �ʽ��ϴ�.");
			return;
		}
		
		System.out.print("��ü�ݾ� : ");
		int amount = scanner.nextInt();
		
		sAccount.setBalance(sAccount.getBalance() - amount);
		rAccount.setBalance(rAccount.getBalance() + amount);
		
		System.out.println("\n��ü�� �Ϸ�Ǿ����ϴ�.\n");
		
	}
	
	// ���� ����
	public static void deleteAccount() {
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		
		Account account = findAccount(ano); 
		if(account == null) {
			System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
			return;
		}
		list.remove(account);
		System.out.println("\n���� ������ �Ϸ�Ǿ����ϴ�.\n");
	}
	
}
