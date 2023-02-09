package selflearn;

public class Static_and_Nonstatic {
	
	static int a =15;
	String s = "tes";

	public static void main(String[] r) {
		// TODO Auto-generated method stub
		Static_and_Nonstatic oj = new Static_and_Nonstatic ();
		oj.sum();
		maths(); //20
		System.out.println(a); //20
		int d= a;
		System.out.println("test d"+d);

	}
	
	
	
	
	
	
	public void sum()
	{
	a=23;
	System.out.println(a);
	s="arun";
	System.out.println(s);
	
	
	}
	
	public static void maths()
	{
		
		System.out.println(a);
		Static_and_Nonstatic ok = new Static_and_Nonstatic ();
		ok.s= "kumar";
		
		System.out.println(ok.s);
	}

}
