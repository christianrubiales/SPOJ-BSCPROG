import java.util.Scanner;

/**
 * Grid-like pattern
 */
class CPTTRN3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        
        for (int i = 0; i < x; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            for (int j = 0; j < a; j++) {
                for (int k = 0; k < 3; k++) {
                	String line = "";
                    line = "";
                    for (int n = 0; n < 3*b; n++) {
                    	line += (k != 0 && k != 3 && n != 0 && n%3 != 0) ? "." : "*";
                    }
                    line += "*";
                    System.out.println(line);
                }
            }
            String linea = "";
            for (int n = 0; n < 3*b; n++) {
            	linea += "*";
            }
            System.out.println(linea + "*");
        }
    }
}
