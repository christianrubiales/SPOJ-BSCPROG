import java.util.Scanner;

/**
 * Sum of squares
 */
class SMPSUM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    	int a = in.nextInt();
    	int b = in.nextInt();
        
    	int sum = 0;
        for (int i = a; i <= b; i++) {
        	sum += i*i;
        }
        System.out.println(sum);
    }
}



