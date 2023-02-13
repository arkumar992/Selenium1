package selflearn;

public class AbstractExtendedd extends AbstracTest {

	
	public void sum() {
		
		System.out.println("testing abstract data");		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExtendedd obj = new AbstractExtendedd();
		obj.sum();
		obj.objectTest();
		
		AbstracTest obj1= new AbstractExtendedd();
		obj1.objectTest();

	}

}
