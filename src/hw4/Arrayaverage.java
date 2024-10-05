package hw4;

public class Arrayaverage {
	public static void main(String[] args) {
		int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		double average = (double) sum / array.length;
		System.out.println("平均值是: " + average);
		System.out.println("大於平均值的元素有: ");
		for (int num : array) {
			if (num > average) {
				System.out.print(num + " ");
			}
		}
	}
}
