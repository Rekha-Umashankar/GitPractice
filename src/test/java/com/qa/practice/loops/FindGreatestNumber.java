package com.qa.practice.loops;

public class FindGreatestNumber {
	public static void main(String[] args) {
	int a=25;
	int b=78;
	int c=87;
	int d =97;
	if(a>b && a>c && a>d) {
		System.out.println("Number a: "+a+"is greatest");
	}else if (b>a && b>c && b>d) {
		System.out.println("Number b: "+b+"is greatest");
	}else if (c>a && c>b && c>d) {
		System.out.println("Number c: " + c +"  "+ "is greatest");
	}else if (d>a && d>b && d>c) {
		System.out.println("Number d: " +d+ "is greatest");
	}
}
}
