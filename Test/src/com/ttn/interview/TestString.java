package com.ttn.interview;

public class TestString {
	
	void helper(int a) throws ArithmeticException{
		try {
			a=a+3;
			throw(ArithmeticException);
		}catch(ArithmeticException ae) {
			System.out.println("");
		}
			
		System.out.println("Value of a is : " + a);
	}
	

	public static void main(String[] args) {
		TestString testString=new TestString();
		int a=5;
		int b=0;
		testString.helper(a);
		//		try {
//		float c=a/b;
//		System.out.println(c);
//		}catch(ArithmeticException ex) {
//			System.out.println("Exceptioin Occured");
//		}
		
	}

}
