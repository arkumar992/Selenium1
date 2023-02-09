package com.java.learn;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		// do-while loop
		do {
			if (i <= 5) {
				// using continue statement
				
				System.out.println("The value of i "+ i);
				//i++;
				break;
				//continue;// it will skip the rest statement
			}
			
			System.out.println(i);
			i++;
		} while (i <= 10);

	}

}
