package selflearnjavaPackage;

public class Parent2 extends Parent {

	public void test2() {
		
		 test1();
		
	}
	
	Parent2(){
		//super();
		System.out.println("child class construtor");
		super.test1();
		
	}
	
	public void pa() {
		
		System.out.println("child menthod");
	}
	
    static void checkStatic() {
		
		System.out.println("child static menthod");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 p = new Parent2();
		Parent.checkStatic();
		checkStatic();
		//p.test1();
		//p.pa();
		
	}

}
