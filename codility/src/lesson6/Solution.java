package lesson6;

import java.util.Arrays;

public class Solution {
	public static int solution(int[] A) {
		Arrays.sort(A);
		int result = 1;
		for (int i = A.length - 3; i < A.length; i++) {
			result *= A[i];
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] {-3, 1, 2, -2, 5, 6}));
	}
}
