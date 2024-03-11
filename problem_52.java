package javaProblem;

public class problem_52 {

	public static void main(String[] args) {
// Write a program to check whether a year is leap year or not
		int year = 1900;
		boolean leap = false;

		// If the year is divisible by 4
		if (year % 4 == 0) {
			// If the year is a century year
			if (year % 100 == 0) {
				// If the year is divisible by 400, it's a leap year
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else {
				// If the year is not a century year, it's a leap year
				leap = true;
			}
		} else {
			leap = false;
		}

		if (leap)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");

	}

}
