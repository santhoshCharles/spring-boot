package Static;
class A{
	void dis() {
		System.out.println("a");
	}
}
class B extends A{
	
	void dis(int a,int b) {
		System.out.println(a);
	}	
}
public class MemAllo {
	int a;
	static int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemAllo m = new MemAllo();
		m.a=100;
		m.c=200;
		System.out.println(m.a+"   "+m.c);
		MemAllo m1 = new MemAllo();
		m1.a=500;
		m1.c=700;
		System.out.println(m1.a+"   "+m1.c);
		System.out.println(m.a+"   "+m.c);
		//MemAllo m3 = new MemAllo();
		//MemAllo m4;
		A a=new B();
		a.dis();
	
	}

}
