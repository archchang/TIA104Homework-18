package hw3;

import java.util.Scanner;

public class GuessNumberGame {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 101);
		Scanner scanner = new Scanner(System.in);
		int guess = -1;
		System.out.println("開始猜數字吧!");
		while (guess != answer) {
			System.out.print("請輸入你的猜測:");
			guess = scanner.nextInt();
			if (guess == answer) {
				System.out.println("答對了! 答案就是 " + answer);
			} else {
				System.out.println(guess > answer ? "猜錯囉，太大了!" : "猜錯囉，太小了!");
			}
		}
		scanner.close();
	}
}
