package lesson5;

public class MinAvgTwoSlice {
	public static int solution(int[] A) {
		int[] sum = new int[A.length + 1];
		sum[0] = 0;
		for (int i = 1; i < sum.length; i++) {
			sum[i] = A[i-1] + sum[i-1];
		}
		double minAvg = Double.MAX_VALUE;
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				double temp = ((double)(sum[j + 1] - sum[i]) / (j + 1 - i));
				if (minAvg > temp) {
					minAvg = temp;
					result = i;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] {4, 2, 2, 5, 1, 5, 8}));
	}
}
