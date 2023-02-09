package selflearn;


class Paren{
	
	static int a =5;
	final int b= 6;
	int c;
	 
	
	 void mat(){		
		
		
		System.out.println("valud c " + (a+b));	
		
		
	}
	
}


class Child extends Paren{
	
	 
	
	
  void mat(){			
		
	  
	  	
		System.out.println("child method");	
		System.out.println("this child" + a);
		
	}
	void childproperty() {
		
		System.out.println("Child property");
		
	}
	
}


public class InheriPorlymor {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Paren.a = 7;
		
		//static polymorphism / compile time
		Paren f = new Paren();
		f.mat();
		
		Child s = new Child();
		s.mat();
		s.childproperty();
		
		// Dynamic polymorphism or run time poly
		Paren dynamic = new Child();
		dynamic.mat();
		InheriPorlymor o = new InheriPorlymor();
		o.test1();
		
	}

	
	public  void test1() {
		
		int f= Paren.a = 8;
		Paren h = new Paren();
		int y= h.c = 9;
		
		System.out.println(f+y);
		
	}
	
}
