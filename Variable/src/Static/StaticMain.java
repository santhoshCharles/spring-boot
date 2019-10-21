package Static;

public class StaticMain {
	static int a =1000;
	void changeStatic() {
		a=a+1;
		System.out.println(a);
	}
	void changeStaticDisplay() {
		a=a+1;
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println("class"+StaticMain.a);
		System.out.println("variable"+a);
		StaticMain s = new StaticMain();
		StaticMain s1 = new StaticMain();
		System.out.println("obj"+s.a);
		s.changeStatic();
		s.changeStaticDisplay();
		s1.changeStatic();
		s1.changeStaticDisplay();
	}

}
