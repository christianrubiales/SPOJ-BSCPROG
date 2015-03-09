import java.util.Scanner;

class SMPSEQ7 {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int[] s = new int[n];
    	
    	for (int i = 0; i < n; i++) {
    		s[i] = in.nextInt();
    	}
    	
    	for (int i = 0; i < n; i++) {
    		if (isDecreasing(s, 0, i) && isIncreasing(s, i + 1, n - 1)) {
    			System.out.println("Yes");
    			return;
    		}
    	}
    	System.out.println("No");
    }
    
    public static boolean isIncreasing(int[] array, int i, int j) {
    	for (int a = i + 1; a <= j; a++) {
    		if (array[a] <= array[a-1]) {
    			return false;
    		}
    	}
    	
    	return true;
    }

    public static boolean isDecreasing(int[] array, int i, int j) {
    	for (int a = i + 1; a <= j; a++) {
    		if (array[a] >= array[a-1]) {
    			return false;
    		}
    	}
    	
    	return true;
    }
}
