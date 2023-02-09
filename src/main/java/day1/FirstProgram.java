package day1;

public  class  FirstProgram {

	public static void main1(int X) {
		// TODO Auto-generated method stub
		
		
		 int[] x = {1,5,6,9};
		 int sum=0;
		
		for(int i=0;i<=x.length-1;i++)
		{
			sum=sum+x[i];
			System.out.println(sum);
		}
		
		
		
		
		

	}
	
	public static void main(String[] args)
	{
		int a=5;
		int b=5;
		int c;
		//c=a+b;
		c=testsum(a,b);
		System.out.println("Value of C "+c);
		
		//return c;
		
		FirstProgram g = new FirstProgram();
		g.main1(5);
	

		
		
	}
	public static int  testsum(int a,int b){
		
		return a*b;
	}
	

	
	

}
