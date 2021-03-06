import java.util.Scanner;

/**
 * Frame-like pattern
 */
class CPTTRN2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        
        for (int i = 0; i < x; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            for (int j = 0; j < a; j++) {
            	String line = "";
                for (int k = 0; k < b; k++) {
                	line += (j != 0 && j != a-1 && k != 0 && k != b-1) ? "." : "*";
                }
                System.out.println(line);
            }
        }
    }
}
