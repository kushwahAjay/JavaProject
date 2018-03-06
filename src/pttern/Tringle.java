package pttern;

public class Tringle {

	public static void main(String[] args) {
		int n = 5;
		int st = 1;
		int sp = n - 1;
		for (int i=1; i <= n; i++) {
			for (int k = 1; k <= sp; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= st; j++) {
				if (j == 1 || j == st) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			sp--;
			st += 2;
		}

	}

}
