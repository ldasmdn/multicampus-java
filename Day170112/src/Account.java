
public class Account {
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 100000;

	private String ano;
	private String owner;
	private int balance;
	
	public Account() {
		
	}
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
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
	
	@Override
	public String toString() {
		return ano + "\t" + owner + "\t" + balance + "\t";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Account) {
			if(this.ano.equals( ((Account) obj).ano )) {
				return true;
			}
		}
		return false;
	}
	
}
