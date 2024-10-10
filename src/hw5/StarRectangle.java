package hw5;
import java.util.Scanner;
public class StarRectangle {
	public static void starSquare(int width, int height) {
		if (width <= 0 || height <= 0) {
			System.out.println("寬與高必須為正整數!");
			return;
		}
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入寬與高:");
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		starSquare(width, height);
		scanner.close();
	}
}
