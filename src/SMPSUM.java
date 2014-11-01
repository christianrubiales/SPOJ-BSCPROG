import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

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



