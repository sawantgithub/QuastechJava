package Pattern;

public class pattern_72 {

	public static void main(String[] args) {
		// 12345
//		    1234
//		    123
//		    12
//		    1
		
		int rows = 5;

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

	}

}
