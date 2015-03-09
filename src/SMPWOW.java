import java.util.Scanner;

/**
 * Repeat 'o' in Wow
 */
class SMPWOW {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String s = "W";
        for (int i = 0; i < x; i++) {
        	s+="o";
        }
        System.out.println(s+"w");
    }
}
