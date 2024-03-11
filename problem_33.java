package javaProblem;

public class problem_33 {
	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
// Write a program to print fibonacci serires upto n terms
		int N = 10; // Change N to the desired number of terms
		for (int i = 0; i < N; i++) {
			System.out.print(fib(i) + " ");
		}
	}

}
