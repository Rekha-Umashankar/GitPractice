 package com.qa.practice.datadriven;

public class FindThirde {

	public static void main(String[] args) {
		String st = "Welcome to Naveen Automation labs";
		int e1 =st.indexOf('e');
		int e2 =st.indexOf('e', e1+1);
		int e3 =st.indexOf('e',e2+1);
		System.out.println(st.charAt(e3));
		System.out.println(e3);
		
	}

}
