package selflearnjavaPackage;

public class ExplainInterface implements TestInterface {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExplainInterface obj =new ExplainInterface();
		System.out.println(obj.data());
		obj.check();
		System.out.println(obj.TestInterface());
		obj.Notpossible();
		
	}

	
	 public int data() {
		// TODO Auto-generated method stub
		
		
		
		int k= e+9;
		
		return k;
	}

	
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("Testing check void only");
		
		
	}

	
	public int TestInterface() {
		// TODO Auto-generated method stub
		int g =e+7;
		return g;
	}

	@Override
	public void Notpossible() {
		// TODO Auto-generated method stub
		
		int  k =0;
		System.out.println("Default value "+(k+3));
		
	}

}
