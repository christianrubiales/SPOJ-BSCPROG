import java.util.Scanner;


class PCROSS1 {

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

			for (int j = 0; j < n; j++) { // mark row
				a[ci-1][j] = '*';
			}
			for (int j = 0; j < m; j++) { // mark col
				a[j][cj-1] = '*';
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
