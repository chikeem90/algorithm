package lesson6;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
	public static int solution(int[] A) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}
		return set.size();
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] {2, 1, 1, 2, 3, 1}));
		System.out.println(solution(new int[] {0}));
	}
}
