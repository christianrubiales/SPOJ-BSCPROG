import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class SMPSEQ4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int[] a = new int[x];
		for (int i = 0; i < x; i++) {
			a[i] = in.nextInt();
		}
		
		int y = in.nextInt();
		Set<Integer> set = new HashSet<Integer>(y);
		for (int i = 0; i < y; i++) {
			set.add(in.nextInt());
		}
		
		for (int i = 0; i < x - 1; i++) {
			if (set.contains(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
		if (set.contains(a[a.length - 1])) {
			System.out.print(a[a.length - 1]);
		}
		System.out.println();
	}

}
