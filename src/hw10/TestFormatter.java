package hw10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestFormatter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		double number = 0;
		
		while(true) {
			System.out.print("請輸入數字:");
			input = scanner.nextLine();
			if (input.matches("-?\\d+(\\.\\d+)?")) {
				number = Double.parseDouble(input);
				break;
			} else {
				System.out.println("數字格式不正確，請再輸入一次!");
			}
		}
		
		System.out.println("欲格式化成(1)千分位 (2)百分比 (3)科學記號: ");
		int choice = scanner.nextInt();
		
		switch (choice) {
			case 1:
					DecimalFormat thousandFormat = new DecimalFormat("#, ###");
					System.out.println("千分位數字: " + thousandFormat.format(number));
					break;
			case 2:
					DecimalFormat percentFormat = new DecimalFormat("#%");
					System.out.println("百分比數字: " + percentFormat.format(number));
					break;
					
			case 3:
					DecimalFormat scientificFormat = new DecimalFormat("0.###E0");
					System.out.println("科學記號數字: " + scientificFormat.format(number));
					break;
					
			default:
					System.out.println("無效的選擇!");
		}
		scanner.close();
	}
}
