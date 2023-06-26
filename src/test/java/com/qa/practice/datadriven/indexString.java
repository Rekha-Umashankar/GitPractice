package com.qa.practice.datadriven;

import java.util.Arrays;

import com.google.common.base.CharMatcher;

public class indexString {

	public static void main(String[] args) {
		String str ="your transaction id is:123 and ref id is:678";
	
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			
			if(Character.isDigit(ch)) {
				
				System.out.print(ch);
			}
		}
	}

}
