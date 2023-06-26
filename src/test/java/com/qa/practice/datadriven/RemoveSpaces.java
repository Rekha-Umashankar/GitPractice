package com.qa.practice.datadriven;

import java.util.Arrays;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str = " Hello Everyone  ";
		String str1 =str.trim();
		String [] str2=str1.split(" ");
		//System.out.println(Arrays.toString(str2));
		for(String s:str2) {
			System.out.print(s);
		}
	}

}
