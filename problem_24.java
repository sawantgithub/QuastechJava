package javaProblem;

public class problem_24 {
	static int power(int N, int P) {
		if (P == 0)
			return 1;
		else
			return N * power(N, P - 1);
	}

	public static void main(String[] args) {
//  write a program to find the value 
//	of one number raised to the power of another
		{
			int N = 2;
			int P = 3;

			System.out.println(power(N, P));
		}

	}
}
