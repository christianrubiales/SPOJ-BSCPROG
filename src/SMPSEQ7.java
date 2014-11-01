import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class SMPSEQ7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        	arr[i] = in.nextInt();
        }

        List<Integer> list1 = new ArrayList<Integer>();
        
        int j = 0;
        int x = arr[0];
        int y = 0;
        list1.add(x);
        for (int i = 1; i < n; i++) {
        	y = arr[i];
        	if (x > y) {
        		list1.add(arr[i]);
        		x = y;
        	} else {
        		j = i;
        		break;
        	}
        }
        
        if (n == list1.size()) {
            System.out.println("No");
            return;
        }
        
        x = arr[j];
        for (int i = j+1; i < n; i++) {
        	y = arr[i];
        	if (x > y) {
	            System.out.println("No");
	            return;
        	}
        }
        System.out.println("Yes");
    }
}
