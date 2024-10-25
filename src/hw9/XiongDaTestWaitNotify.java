package hw9;

class Account {
	private int balance = 0;
	public synchronized void deposit(int amount) {
		while (balance >= 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += amount;
		System.out.println("媽媽存了" + amount + "，帳戶共有:" + balance);
		notifyAll();
	}
	public synchronized void withdraw(int amount) {
		while (balance < amount) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("熊大領了" + amount + "，帳戶共有:" + balance);
		if (balance <= 2000) {
			System.out.println("能大看到餘額在2000以下，要求匯款");
		}
		notifyAll();
	}
	
	public int getBalance() {
		return balance;
	}
}

class Mom extends Thread {
	private Account account;
	
	public Mom(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			account.deposit(2000);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Bear extends Thread {
	private Account account;
	
	public Bear(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			account.withdraw(1000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class XiongDaTestWaitNotify {
	public static void main(String[] args) {
		Account account = new Account();
		Mom mom = new Mom(account);
		Bear bear = new Bear(account);
		
		mom.start();
		bear.start();
	}
}
