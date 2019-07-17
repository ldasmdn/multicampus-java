
public class Account {
	
	private String ano;
	private String owner;
	private int balance;
	
	private static int MIN_BALANCE = 0;
	private static int MAX_BALANCE = 1000000;
	
	private static int numOfAccounts = 0;
	
	public Account(String ano, String owner, int balance) {
		
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		numOfAccounts++;
		
	}
	
	public static void decreaseNumOfAccounts() {
		numOfAccounts--;
	}
	
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;			
		}
		
	}
	
	public static int getNumOfAccounts() {
		return numOfAccounts;
	}

	@Override
	public String toString() {
		return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
}
