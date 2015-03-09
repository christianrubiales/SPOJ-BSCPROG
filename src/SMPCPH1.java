import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class SMPCPH1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String s = in.nextLine();
        int m = Integer.parseInt(in.nextLine());
        
        Map<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < n - 1; i++) {
        	map.put(s.charAt(i), s.charAt(i + 1));
        }
        map.put(s.charAt(s.length() - 1), s.charAt(0));
        
        for (int i = 0; i < m; i++) {
        	String t = in.nextLine();
        	
        	for (int j = 0; j < t.length(); j++) {
        		if (map.containsKey(t.charAt(j))) {
        			System.out.print(map.get(t.charAt(j)));
        		} else {
        			System.out.print(t.charAt(j));
        		}
        	}
        	System.out.println();
        }
	}

}
