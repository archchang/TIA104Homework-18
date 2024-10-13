package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		try {
			Calculator calculator = new Calculator();
			Scanner scanner = new Scanner(System.in);
			System.out.print("請輸入x的值: ");
			int x = Integer.parseInt(scanner.nextLine());
			System.out.print("請輸入y的值: ");
			int y = Integer.parseInt(scanner.nextLine());
			calculator.setX(x);
			calculator.setY(y);
			System.out.println(x + "的" + y +"次方等於" + calculator.getPower());
		} catch (CalException ce) {
			ce.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("輸入格式不正確");
		}
	}
}
