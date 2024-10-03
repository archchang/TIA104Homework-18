package hw3;

import java.util.Scanner;

public class Biglotto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] numbers = new int[49];
		for (int i = 0; i < 49; i++) {
			numbers[i] = i + 1;
		}
		System.out.println("阿文...請輸入你討厭哪個數字(1~9):");
		int dislikedNumber = scanner.nextInt();
		if (dislikedNumber < 1 || dislikedNumber > 9) {
			System.out.println("請輸入有效的數字 (1~9)!");
			return;
		}
		int[] availableNumbers = new int[49];
		int availableCount = 0;
		for (int number : numbers) {
			if (!containsDigit(number, dislikedNumber)) {
				availableNumbers[availableCount] = number;
				availableCount++;
			}
		}
		System.out.println("你可以選擇的號碼如下:");
		int count = 0;
		for (int i = 0; i < availableCount; i++) {
			System.out.printf("%2d ", availableNumbers[i]);
			count++;
			if (count % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n總共有" + availableCount + "數字可選");
		System.out.println("\n隨機選取的6個號碼是:");
		int[] selectedNumbers = new int[6];
		int selectedCount = 0;
		while (selectedCount < 6) {
			int index = (int)(Math.random() * availableCount);
			int selected = availableNumbers[index];
			if(!contains(selectedNumbers, selected, selectedCount)) {
				selectedNumbers[selectedCount] = selected;
				selectedCount++;
				System.out.printf("%2d ", selected);
			}
		}
		scanner.close();
	}
	public static boolean containsDigit(int number, int dislikedDigit) {
		while (number > 0) {
			int digit = number % 10;
			if (digit == dislikedDigit) {
				return true;
			}
			number /= 10;
		}
		return false;
	}
	public static boolean contains(int[] array, int number, int size) {
		for (int i = 0; i < size; i++) {
			if (array[i] == number) {
				return true;
			}
		}
		return false;
	}
}
