package m02.s10.ex;

public class Exercise1 {
	public static void main(String[] args) {
		System.out.println("print all values in [0 .. 9]");

		// TODO: print all values in [0 .. 9]
		// (1) for loop
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		// (2) while loop
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i = i + 1;
		}
		// (3) do-while loop
		int i1 = 0;
		do {
			System.out.println(i1);
			i1 = i1 + 1;
		} while (i1 < 10);

	}
}