package org.methods;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s1 = "    java is a programming language";
		String s2 ="automation tester";
		boolean empty = s1.isEmpty();
		System.out.println(empty);
		
		String substring = s1.substring(2);
		System.out.println(substring);
		
		String substring2 = s1.substring(2, 6);
		System.out.println(substring2);
		
		boolean contains = s1.contains(" ");
		System.out.println(contains);
		
		String concat = s1.concat(" and python is alson a proramming language");
		System.out.println(concat);
		
		String trim = s1.trim();
		System.out.println(trim);
		
		String[] l = s1.split("a");
		System.out.println(l);
		
		System.out.println(s2);
	
	}

}
