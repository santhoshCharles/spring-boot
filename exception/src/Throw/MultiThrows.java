package Throw;

public class MultiThrows {
	void m1() throws InterruptedException {
		m2();
	}
	void m2() throws InterruptedException {
		m3();
	}
	void m3() throws InterruptedException {
		System.out.println("sleep");
		Thread.sleep(3000);
		System.out.println("sleep");
	}
	public static void main(String[] args) {
		try {
		new MultiThrows().m1();
		}catch(InterruptedException ie) {
			System.out.println(ie);
		}
	}
}
