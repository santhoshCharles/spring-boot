package ObjMethod;

public class SameVariable {
	int x=10,y=20;
	void dis(int x, int y) {
		System.out.println(x+y);//local op=50
		System.out.println(x+y);//instance op=50
		System.out.println(this.x+this.y);//instance op=30
	}
	static void disp(int x, int y) {
		System.out.println(x+y);//local op=100
		System.out.println(x+y);//instance op=100
		//System.out.println(this.x+this.y);//err
		SameVariable s = new SameVariable();
		System.out.println(s.x+s.y);//op=30
	}
	public static void main(String[] args) {
		SameVariable s = new SameVariable();
		s.dis(20, 30);
		disp(40, 60);
	}
}
