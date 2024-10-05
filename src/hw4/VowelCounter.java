package hw4;

public class VowelCounter {
	public static void main(String[] args) {
		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int vowelCount = 0;
		for (String planet : planets) {
			for (char ch : planet.toLowerCase().toCharArray()) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				}
			}
		}
		System.out.println("陣列中共有 " + vowelCount + "個母音");
	}
}
