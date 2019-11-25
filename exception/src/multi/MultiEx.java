package multi;

public class MultiEx {
	public static void main(String[] args) {
		try {
			//int s = 1000/0;
			int a[]=new int[100];
			a[101] = 100;
		}catch(Exception e){System.out.println("common task completed"+e);}    
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		catch(ArrayIndexOutOfBoundsException a) {
//			System.out.println(a);
//		}
	}
}
