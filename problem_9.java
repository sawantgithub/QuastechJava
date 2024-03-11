package javaProblem;

public class problem_9 {
	public static int removeDuplicates(int[] a, int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[n - 1];
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
//  Create a java Program ti remove duplicate 
//  elements between two arrays and print the modified array.

		int[] a = { 1, 1, 2, 3, 2,4,5,5,6,7,8,8,9,10,10 };
		int n = a.length;
		n = removeDuplicates(a, n);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
