import java.util.Scanner;


class STRHH {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for (int i = 0; i < t; i++) {
        	String s = in.next();
            for (int j = 0; j < s.length() / 2; j+=2) {
            	System.out.print(s.charAt(j));
            }
            System.out.println();
        }
	}

}