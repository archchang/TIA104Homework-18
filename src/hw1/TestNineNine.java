package hw1;

public class TestNineNine {
	public static void main(String[] args) {
		System.out.println("使用for迴圈+ while迴圈");
		for (int num1 = 1; num1 <= 9; num1++) {
			int num2 = 1;
			while (num2 <= 9) {
				System.out.print(num1 + "x" + num2 + "=" + num1 * num2 + "\t");
				num2++;
			}
			System.out.println();
		}
		System.out.println("使用for迴圈+ do while迴圈");
		for(int num3 = 1; num3 <= 9; num3++) {
			int num4 = 1;
			do {
				System.out.print(num3 + "x" + num4 + "=" + num3 * num4 + "\t");
				num4++;
			} while (num4 <= 9);
			System.out.println();
		}
		System.out.println("使用while迴圈+ do while迴圈");
		int num5 = 1;
		while (num5 <= 9) {
			int num6 = 1;
			do {
				System.out.print(num5 + "x" + num6 + "=" + num5*num6 + "\t");
				num6++;
			} while (num6 <= 9);
			System.out.println();
			num5++;
		}
	}
}
