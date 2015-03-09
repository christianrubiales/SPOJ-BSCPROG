import java.util.Scanner;

/**
 * Chessboard-like pattern
 */
class CPTTRN1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
//        System.out.println(x);
        for (int i = 0; i < x; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
//            System.out.println(a + " " + b);

            boolean odd = true;
            for (int j = 0; j < a; j++) {
            	String line = "";
                for (int k = 0; k < b; k++) {
                	if (odd) {
                		line += k%2==0 ? "*" : ".";
                	} else {
                		line += k%2==0 ? "." : "*";
                	}
                }
            	odd = !odd;
                System.out.println(line);
            }
        }
    }
}
