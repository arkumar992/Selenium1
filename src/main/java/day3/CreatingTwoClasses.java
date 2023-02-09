package day3;
class CreatingSecondClass{
	String  name ="RAGAVI";
	char initial = 'C';
	float height = 5.0f;
	double weight = 47.7d;
	
	 void printDataClass2() {
	System.out.println("Name:"+name);
	System.out.println("Initial:"+initial);
	System.out.println("Height:"+height);
	System.out.println("Weight:"+weight);
	}
}
	class CreatingTwoClasses {

	static int number1=7;
	
	public static void printData1() {
	
	System.out.println("Display number:"+number1);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
printData1();
CreatingSecondClass s = new CreatingSecondClass();
s.printDataClass2();
}

	
}


