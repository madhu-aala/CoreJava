package arrays;

public class MaxCombo {

	public static void main(String[] args) {
		int[] weight = {1, 3, 4, 5};
		int[] value = {2, 6, 7, 8};
		int bagCapacity = 10;

		int maxCombo = 0;

		for (int i = 0; i < weight.length; i++) {
			for (int j = i + 1; j < weight.length; j++) {
				for (int k = j + 1; k < weight.length; k++) {
					if (weight[i] + weight[j] + weight[k] == bagCapacity) {
						int sum = value[i] + value[j] + value[k];
						if (sum > maxCombo) {
							maxCombo = sum;
						}
					}
				}
			}
		}
		System.out.println("Sum of Maximum combination: " + maxCombo);
	}
}