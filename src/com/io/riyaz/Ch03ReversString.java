package com.io.riyaz;

public class Ch03ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("hello world"));

	}
	
	public static String reverseString(String str) {
		StringBuilder reverse = new StringBuilder();
		for(int i=str.length()-1; i>=0; i-- ) {
			reverse.append(str.charAt(i));
		}
		return reverse.toString();
	}

}
