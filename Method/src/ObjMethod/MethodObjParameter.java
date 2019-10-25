package ObjMethod;
class A{int a=10;}
class B{int a= 20;}
public class MethodObjParameter {
	void display(A a, B b) {
		System.out.println(a.a+"   "+b.a);
	}
	public static void main(String[] args) {
		MethodObjParameter m = new MethodObjParameter();
		A a = new A();
		B b = new B();
		m.display(a, b);
	}
}
