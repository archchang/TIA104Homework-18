package hw5;
import java.util.Random;
public class RandomAverage {
	public static void randAvg() {
		Random rand = new Random();
		int[] numbers = new int[10];
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			numbers[i] = rand.nextInt(101);
			sum += numbers[i];
		}
		double average = (double) sum / numbers.length;
		System.out.println("本次亂數結果:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.printf("平均值: %.2f%n", average);
	}
	public static void main(String[] args) {
		randAvg();
	}
}
