import java.util.Scanner;


/**
 * Diagonal cross pattern
 */
class PCROSS2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for (int i = 0; i < t; i++) {
			int m = in.nextInt();
			int n = in.nextInt();
			int ci = in.nextInt();
			int cj = in.nextInt();
			
			char[][] a = new char[m][n];
			
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < n; k++) {
					a[j][k] = '.';
				}
			}

			a[ci-1][cj-1] = '*';
			
			for (int j = ci - 2, k = cj - 2; j > -1 && k > -1; j--, k--) { // NW
				a[j][k] = '*';
			}
			for (int j = ci - 2, k = cj; j > -1 && k < n; j--, k++) { // NE
				a[j][k] = '*';
			}
			for (int j = ci, k = cj - 2; j < m && k > -1; j++, k--) { // SW
				a[j][k] = '*';
			}
			for (int j = ci, k = cj; j < m && k < n; j++, k++) { // SE
				a[j][k] = '*';
			}
			
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < n; k++) {
					System.out.print(a[j][k]);
				}
				System.out.println();
			}
		}
	}

}
