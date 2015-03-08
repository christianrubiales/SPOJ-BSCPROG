import java.util.Scanner;


class SMPSEQ5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int[] a = new int[x];
		for (int i = 0; i < x; i++) {
			a[i] = in.nextInt();
		}

		int y = in.nextInt();
		int min = x < y ? x : y;
		
		for (int i = 0; i < min - 1; i++) {
			if (a[i] == in.nextInt()) {
				System.out.print((i+1) + " ");
			}
		}
		if (a[min - 1] == in.nextInt()) {
			System.out.print((min) + " ");
		}
		System.out.println();
	}

}
