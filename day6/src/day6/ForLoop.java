package day6;

public class ForLoop {

	public static void main(String[] args) {
		for (int row = 0; row < 5; row++) {
			for (int j = 0; j < row; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}

	}

}
