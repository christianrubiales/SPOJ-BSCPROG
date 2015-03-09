import java.util.Scanner;

/**
 * Divisibility
 */
class SMPDIV {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        
        for (int i = 0; i < tests; i++) {
        	int n = in.nextInt();
        	int x = in.nextInt();
        	int y = in.nextInt();
        	String s = "";
        	
            for (int j = 0; j < n; j++) {
	        	if (j%x==0 && j%y!=0) {
	        		s += j + " ";
	        	}
            }
    		System.out.println(s.trim());
        }
    }
}



