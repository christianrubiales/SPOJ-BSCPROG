import java.util.Scanner;


/**
 * Same index in the range
 */
class SMPSEQ6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();

		int[] s = new int[n];
		int[] q = new int[n];
		
		for (int i = 0; i < n; i++) {
			s[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			q[i] = in.nextInt();
		}

		StringBuilder u = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = i - x; j <= i + x; j++) {
				if (j > -1 && j < n && s[i] == q[j]) {
					u.append((i+1) + " ");
					break;
				}
			}
		}

		System.out.println(u.toString().trim());
	}

}
