package hw4;
import java.util.Scanner;
public class DayOfYearCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入年份 (yyyy): ");
		int year = scanner.nextInt();
		System.out.print("請輸入月份 (mm): ");
		int month = scanner.nextInt();
		System.out.print("請輸入日期 (dd): ");
		int day = scanner.nextInt();
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (isLeapYear(year)) {
			daysInMonth[1] = 29;
		}
		String errorMessages = "";
		if (month < 1 || month > 12) {
			System.out.println("月份輸入錯誤!");
			if (day < 1 || day > 31) {
				System.out.println("日期輸入錯誤!");
			}
			return;
		}
		if (day < 1 || day > daysInMonth[month - 1]) {
			System.out.println("日期輸入錯誤!");
			return;
		}
		if (!errorMessages.isEmpty()) {
			System.out.println(errorMessages);
			return;
		}
		int dayOfYear = 0;
		for (int i = 0; i < month - 1; i++) {
			dayOfYear += daysInMonth[i];
		}
		dayOfYear += day;
		System.out.println("輸入的日期為該年的第 " + dayOfYear + " 天。");
	}
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}
	
}
