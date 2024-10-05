package hw4;
import java.util.Scanner;
public class BorrowMoney {
	public static void main(String[] args) {
		int[][] employees = {
				{25, 2500},
				{32, 800},
				{8, 500},
				{19, 1000},
				{27, 1200}
		};
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入欲借的金額: ");
		int amountToBorrow = scanner.nextInt();
		int count = 0;
		System.out.print("有錢可借的員工編號: ");
		for (int i = 0; i < employees.length; i++) {
			if (employees[i][1] >= amountToBorrow) {
				System.out.print(employees[i][0] + " ");
				count++;
			}
		}
		if (count > 0) {
			System.out.println("共 " + count + " 人!");
		} else {
			System.out.println("抱歉，沒有同事有足夠的錢可借。");
		}
		scanner.close();
	}
}
