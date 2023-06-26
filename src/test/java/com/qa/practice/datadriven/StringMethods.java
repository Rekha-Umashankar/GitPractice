package com.qa.practice.datadriven;


import java.util.Arrays;

public class StringMethods {
	
	

	public static void main(String[] args) {
		String s ="This is my java code i am so happy";
		String q ="";
		String [] splitString = s.split(" ");
		String lastString =(splitString[splitString.length-1]);
		
		//System.out.println(lastString);
		 for(int i=lastString.length()-1;i>=0;i--) {
			
			 System.out.print(lastString.charAt(i));
		 }
		 for(int i=0;i<=splitString.length-2;i++) {
			 System.out.print(splitString[i]);
		 }
		
}
}
