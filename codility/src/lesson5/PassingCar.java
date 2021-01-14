package lesson5;

public class PassingCar {
	public static int solution(int[] A) {
		for (int i = 0; i < A.length; i++) {

		}
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				for (int j = i + 1; j < A.length; j++) {
					if (A[j] == 1) {
						result++;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] {0, 1, 0, 1, 1}));
	}
}
