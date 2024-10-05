package hw4;

public class HighestScoreCounter {
	public static void main(String[] args) {
		int[][] scores = {
				{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 20, 99, 75}
		};
		int[] highestScoreCounts = new int[8];
		for (int i = 0; i < scores.length; i++) {
			int maxScore = -1;
			for (int j = 0; j < scores[i].length; j++) {
				if (scores[i][j] > maxScore) {
					maxScore = scores[i][j];
				}
			}
			for (int j = 0; j < scores[i].length; j++) {
				if (scores[i][j] == maxScore) {
					highestScoreCounts[j]++;
				}
			}
		}
		for (int i = 0; i < highestScoreCounts.length; i++) {
			System.out.println("同學 " + (i + 1) + " 獲得最高分的次數: " + highestScoreCounts[i]);
		}
	}
}
