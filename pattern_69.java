package Pattern;

public class pattern_69 {

	public static void main(String[] args) {
	//  54321
//		54321
//		54321
//		54321
//		54321
		
		 int rows = 5;
	        int cols = 5;

	        for (int i = 1; i <= rows; i++) {
	            for (int j = cols; j >= 1; j--) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	}

}
