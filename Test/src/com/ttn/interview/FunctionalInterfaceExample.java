package com.ttn.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@FunctionalInterface
interface TodoSomething{
	int done(int a, int b);
}

public abstract class FunctionalInterfaceExample implements TodoSomething{
	
	
	void ArraylistExample() {
		List<String> arr=new ArrayList<String>(Arrays.asList("abcdef", "dseqabc", "aqqwewer"));
		arr.stream()
		   .filter(arg0)
	}

	public static void main(String[] args) {
		
		
		TodoSomething todoSomething=new TodoSomething() {
			
			@Override
			public int done(int a, int b) {
				return a+b;
			}
		};
		
		System.out.println(todoSomething.done(4, 5));

	}

}
