package exception;

public class MultiCatch {
	public static void mani(String[] args) {
		try {
			int d = 10/0;
		}
		catch(ArithmeticException a) {
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException c) {
			System.out.println(c);
		}
	}
}
