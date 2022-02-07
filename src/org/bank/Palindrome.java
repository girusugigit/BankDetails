package org.bank;

import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();		
		char[] inArr = input.toCharArray();
		String reverse="";
		System.out.println("in" + inArr.length);
		for (int i = inArr.length - 1; i >= 0; i--) {
			reverse=reverse+inArr[i];
		}
		if(reverse.equals(input)) {
			System.out.println( input +" Its Palindrome");
		}
		else {
			System.out.println(input+"  Not a Palindrome");
		}
	}

}
