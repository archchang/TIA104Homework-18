package hw2;

public class Homework2 {
	public static void main(String[] args) {
		System.out.println("請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)");
		int sum = 0;
		for (int i = 2; i <= 1000; i+=2) {
			sum += i;
		}
		System.out.println("1到1000的偶數和為:" + sum);
		
		System.out.println("=============這不是分隔線=========================");
		System.out.println("請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)");
		long product = 1;
		for(int i2 = 1; i2 <= 10; i2++) {
			product *= i2;
		}
		System.out.println("1 到 10 的連乘積為:" + product);
		
		System.out.println("=============這不是分隔線=========================");
		System.out.println("請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)");
		long product3 = 1;
		int i3 = 1;
		while (i3 <= 10) {
			product3 *= i3;
			i3++;
		}
		System.out.println("1 到 10 的連乘積為:" + product3);
		
		System.out.println("=============這不是分隔線=========================");
		System.out.println("請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100");
		for (int i4 = 1; i4 <= 10; i4++) {
			int square = i4 * i4;
			System.out.print(square + " ");
		}
		
		System.out.println("=============這不是分隔線=========================");
		System.out.println(" 阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，\r\n"
				+ "輸出結果為阿文可以選擇的數字有哪些？總共有幾個？");
		int count = 0;
		System.out.println("阿文可以選擇的數字有:");
		for (int i5 = 1; i5 <= 49; i5++) {
			int number = i5;
			boolean containsFour = false;
			while(number > 0) {
				if (number % 10 ==4) {
					containsFour = true;
					break;
				}
				number /= 10;
			}
			if(!containsFour) {
				System.out.print(i5 + " ");
				count++;
			}
		}
		System.out.println("\n總共有 " + count + " 個數字。");
		
		System.out.println("=============這不是分隔線=========================");
		System.out.println("  請設計一隻Java程式，輸出結果為以下："
				+ "1 2 3 4 5 6 7 8 9 10\r\n"
				+ " 1 2 3 4 5 6 7 8 9\r\n"
				+ " 1 2 3 4 5 6 7 8\r\n"
				+ " 1 2 3 4 5 6 7\r\n"
				+ " 1 2 3 4 5 6 \r\n"
				+ "1 2 3 4 5\r\n"
				+ " 1 2 3 4 \r\n"
				+ "1 2 3 \r\n"
				+ "1 2 \r\n"
				+ "1");
		
		for (int i6 = 10; i6 >= 1; i6--) {
			for (int j = 1; j <= i6; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("=============這不是分隔線=========================");
		System.out.println("請設計一隻Java程式，輸出結果為以下："
				+ "A\r\n"
				+ " BB\r\n"
				+ " CCC\r\n"
				+ " DDDD\r\n"
				+ " EEEEE\r\n"
				+ " FFFFFF");
		
		for (int i7 = 1; i7 <= 6; i7++) {
			char letter = (char)('A' + i7 - 1);
			for (int j = 1; j <= i7; j++) {
				System.out.print(letter);
			}
			System.out.println();
		}
	}
}
