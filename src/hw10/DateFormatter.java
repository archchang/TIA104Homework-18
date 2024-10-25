package hw10;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DateFormatter {
	public static boolean isValidDate(String date) {
		String regex = "\\d{8}";
		return Pattern.matches(regex, date);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputDate;
		boolean validInput = false;
		do {
			System.out.print("請輸入日期(年月日，例如:20110131): ");
			inputDate = scanner.nextLine();
			
			if (isValidDate(inputDate)) {
				validInput = true;
			} else {
				System.out.println("日期格式不正確，請再輸入一次!");
			}
		} while (!validInput);
		
		String year = inputDate.substring(0, 4);
		String month = inputDate.substring(4, 6);
		String day = inputDate.substring(6, 8);
		
		System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年: ");
		int choice = scanner.nextInt();
		
		switch (choice) {
			case 1:
					System.out.println("格式化後日期: " + year + "/" + month + "/" + day);
					break;
			case 2:
					System.out.println("格式化後日期: " + month + "/" + day + "/" + year);
					break;
			case 3:
					System.out.println("格式化後日期: " + day + "/" + month + "/" + year);
					break;
			default:
				System.out.println("無效的選擇!");
		}
		scanner.close();
	}
}
