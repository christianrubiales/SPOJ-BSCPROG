import java.util.Scanner;


class SMPSEQ9 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int ave1 = 0;
		int[] a = new int[x];
		for (int i = 0; i < x; i++) {
			a[i] = in.nextInt();
			ave1 += a[i];
		}
		ave1 = ave1 / x;

		int y = in.nextInt();
		int ave2 = 0;
		int[] b = new int[y];
		for (int i = 0; i < y; i++) {
			b[i] = in.nextInt();
			ave2 += b[i];
		}
		ave2 = ave2 / y;
		
		StringBuilder u = new StringBuilder();
		if (ave2 < ave1) {
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
