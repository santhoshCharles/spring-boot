package Finally;

public class SimFinally {
	public static void main(String[] args) {
		try {
			System.out.println("1 try");
		} catch(Exception e) {
			System.out.println("1 catch");
		}
		finally {
			System.out.println("1 finally");
		}
		
		
		try {
			System.out.println("2 try");
			int a=10/0;
		} catch(Exception e) {
			System.out.println("2 catch");
		}
		finally {
			System.out.println("2 finally");
		}
		
		
		try {
			System.out.println("3 try");
			int a=10/0;
		} catch(NullPointerException e) {
			System.out.println("3 catch");
		}
		finally {
			System.out.println("3 finally");
		}
		
		System.out.println(10/0);
		try {
			System.out.println("4 try");
			int a=10/0;
		} catch(NullPointerException e) {
			System.out.println("4 catch");
		}
		finally {
			System.out.println("4 finally");
		}
		
	}
}
