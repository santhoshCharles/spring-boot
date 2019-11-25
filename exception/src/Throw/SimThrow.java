package Throw;

public class SimThrow {
	static void val(int age) {
		if(age<18) {
			throw new ArithmeticException("can't vote");
		}
		else {
			System.out.println("can vote");
		}
	}
	public static void main(String[] args) {
		val(17);
		System.out.println("can vote");
	}

}
