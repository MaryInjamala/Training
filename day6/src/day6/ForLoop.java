package day6;

public class ForLoop {
	public static void main(String[] args) {
		usingWhileLoop();
		usingForLoop();

	}

	private static void usingWhileLoop() {
		int row, col, n = 5;
		row = n - 1;
		if (n <= 0) {
			throw new IllegalArgumentException("row value should be greater than zero");
		}
		while (row >= 0) {
			col = 0;
			while (col <= row) {
				System.out.print("*");
				col++;
			}
			System.out.println("\n");
			row--;

		}

	}

	private static void usingForLoop() {
		int n = 5;
		if (n <= 0) {
			throw new IllegalArgumentException("row value should be greater than zero");
		}
		for (int row = n - 1; row >= 0; row--) {
			for (int col = 0; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}

	}

}
