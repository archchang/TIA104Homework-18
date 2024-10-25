package hw9;

import java.util.Random;

class ContestantRunnable implements Runnable {
	private String name;
	private int bowls;
	public ContestantRunnable(String name, int bowls) {
		this.name = name;
		this.bowls = bowls;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random random = new Random();
		for (int i = 1; i <= bowls; i++) {
			System.out.println(name + "吃第" + i + "碗飯");
			try {
				Thread.sleep(500 + random.nextInt(2500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + " 吃完了!");
	}
}
public class EatingCompetition {
	public static void main(String[] args) {
		System.out.println("-----大骨王快食比賽開始!-----");
		ContestantRunnable mantouRen = new ContestantRunnable("饅頭人", 10);
		ContestantRunnable james = new ContestantRunnable("詹姆士", 10);
		Thread thread1 = new Thread(mantouRen);
		Thread thread2 = new Thread(james);
		thread1.start();
		thread2.start();
		try {
			thread1.join(10000);
			if (thread1.isAlive()) {
				System.out.println("饅頭人的執行緒超時，重新計時，繼續比賽!");
				thread1.interrupt();
			}
			thread2.join(10000);
			if (thread2.isAlive()) {
				System.out.println("詹姆士的執行緒超時，重新計時，繼續比賽!");
				thread2.interrupt();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束!-----");
	}
}
