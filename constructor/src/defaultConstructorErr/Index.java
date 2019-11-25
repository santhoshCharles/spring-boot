package defaultConstructorErr;

public class Index {
	Index(int a){
		
	}
	void m1() {
		System.out.print("hiiiiiiii");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Index i = new Index();//err
		Index i1 = new Index(10);
		
	}

}
