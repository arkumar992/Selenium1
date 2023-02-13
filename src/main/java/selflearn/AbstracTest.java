package selflearn;

public abstract class AbstracTest {
	
	public  abstract  void sum();
	
	public static void test()
	{
		System.out.println("test non abstract ");
	}
	
	void objectTest() {
		
		System.out.println("Just print object if allowed");
	}
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstracTest.test();
		
		// Due to abstract class we can't create object.
		//AbstracTest obj= new	AbstracTest();
		
		System.out.println("test abstract");

	}

}
