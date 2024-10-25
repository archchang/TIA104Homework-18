package hw10;

public class PrimeCheckWithMath {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		for (int i = 0; i < 5; i++) {
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		for (int num : numbers) {
			if (isPrime(num)) {
				System.out.println(num + " 是質數");
			} else {
				System.out.println(num + " 不是質數");
			}
		}
	}
	
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
