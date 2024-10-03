package hw3;

import java.util.Scanner;

public class Trianglerecognition {
	public static boolean isTriangle(int a, int b, int c) {
		return a + b > c && a + c > b && b + c > a;
	}

	public static boolean isEquilateral(int a, int b, int c) {
		return a == b && b == c;
	}

	public static boolean isIsosceles(int a, int b, int c) {
		return a == b || b == c || a == c;
	}

	public static boolean isRighttriangle(int a, int b, int c) {
		return ((a * a + b * b == c * c) ||
					(a * a + c * c == b * b) ||
					(b * b + c * c == a * a));
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (!isTriangle(a, b, c)) {
			System.out.println("不是三角形");
		} else if (isEquilateral(a, b, c)) {
			System.out.println("正三角形");
		} else if (isIsosceles(a, b, c)) {
				System.out.println("等腰三角形");
		} else if (isRighttriangle(a, b, c)){
				System.out.println("直角三角形");
		} else {
			System.out.println("其它三角形");
		}
		scanner.close();
	}
}
