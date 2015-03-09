import java.util.Scanner;


/**
 * Compare sums
 */
class SMPSEQ8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int sum1 = 0;
		int[] a = new int[x];
		for (int i = 0; i < x; i++) {
			a[i] = in.nextInt();
			sum1 += a[i];
		}

		int y = in.nextInt();
		int sum2 = 0;
		int[] b = new int[y];
		for (int i = 0; i < y; i++) {
			b[i] = in.nextInt();
			sum2 += b[i];
		}
		
		StringBuilder u = new StringBuilder();
		if (sum2 < sum1) {
			for (int i = 0; i < x; i++) {
				u.append(a[i] + " ");
			}
		} else {
			for (int i = 0; i < y; i++) {
				u.append(b[i] + " ");
			}
		}
		System.out.println(u.toString().trim());
	}

}
