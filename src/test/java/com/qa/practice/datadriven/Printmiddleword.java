package com.qa.practice.datadriven;

public class Printmiddleword {

	public static void main(String[] args) {
		String str = "Hello to all";
		int a= str.indexOf(" ");
		System.out.println(a);
		int b =str.indexOf(" ", a+1);
		for(int i=a+1;i<=b-1;i++) {
			System.out.print(str.charAt(i));
		}
		

	}

}
