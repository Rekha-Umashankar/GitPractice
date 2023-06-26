package com.qa.practice.datadriven;

public class LastHalfOfString {
	public static void main(String[] args) {
		String str = "abcd1234";
		int lenHalf = str.length()/2;
	//	System.out.println(lenHalf);
		for(int i =lenHalf;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
	}
}
