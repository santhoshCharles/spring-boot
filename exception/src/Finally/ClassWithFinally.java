package Finally;

public class ClassWithFinally {
	void m1() {
		try {
		m2();
		}catch(ArithmeticException a) {
			System.out.println(a);
			System.out.println(a.toString());
			System.out.println(a.getMessage());
			a.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}
	}
	void m2() {
		m3();
		
	}
	void m3() {
		int a=10/0;
	}
public static void main(String[] args) {
	new ClassWithFinally().m1();
}
}
