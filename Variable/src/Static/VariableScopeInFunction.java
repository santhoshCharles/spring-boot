package Static;

public class VariableScopeInFunction {
	int a = 1, b=5;
	static int c = 1;
	static int d = 8;
	void display () {
		System.out.println(a+""+b+""+c+""+d);
	}
	static void displayStatic(VariableScopeInFunction v) {
		//VariableScopeInFunction v = new VariableScopeInFunction();
		System.out.println(v.a+""+v.b+""+c+""+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableScopeInFunction v = new VariableScopeInFunction();
		v.display();
		displayStatic(v);
	}

}
