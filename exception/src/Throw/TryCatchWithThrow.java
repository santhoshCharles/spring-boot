package Throw;

import java.io.IOException;

//public class TryCatchWithThrow {
//	static void a() {
//		int d=10/0;
//	}
//	static void b() {
//		a();
//		System.out.println("exception in b meth");
//	}
//	static void c() {
//		try{
//			b();
//		}catch(Exception e) {
//			System.out.println("exception");
//		}
//	}
//	public static void main(String[] args) {
//		c();
//		System.out.println("normal");
//	}
//}

class TryCatchWithThrow{  
	  void m() throws IOException{  
	    throw new java.io.IOException("device error");//checked exception  
	  }  
	  void n() throws IOException{  
	    m();  
	    System.out.println("normal flow in m meth");
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handeled");}  
	  }  
	  public static void main(String args[]){  
		  TryCatchWithThrow obj=new TryCatchWithThrow();  
	   obj.p();  
	   System.out.println("normal flow");  
	  }  
	}  
