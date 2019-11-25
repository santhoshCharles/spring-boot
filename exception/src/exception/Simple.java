package exception;

public class Simple {
	public static void main(String[] args) {
		try {
			int a=100/0;
			System.out.println("rest of the code");
		} catch(ArithmeticException a) {System.out.println("exce  "+a);
		try
		{
			System.out.println("in h  ");
			int u = 50/0;
			}catch(ArithmeticException h) {
				System.out.println("exce h  "+h);
			}
		}
		System.out.println("aft h");
		try {
			int u = 50/0;
		}catch(ArrayIndexOutOfBoundsException h) {
			System.out.println("exce h  "+h);
		}
		System.out.println("aft catch");
	}
}
