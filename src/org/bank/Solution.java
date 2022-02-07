package org.bank;

public class Solution {

	 public int lengthOfLastWord(String s) {
		 
		 if(s!=null) {
			 String s1 = s.trim();
			 String s2=s1.substring(s1.lastIndexOf(" "),s1.length()-1);
			 return s2.length();
		 }
		 return 0;

	}
	 public static void main(String args[]) {
		 Solution s=new Solution();
		System.out.println(" Length "+ s.lengthOfLastWord("Hello World"));
		
		System.out.println(" Length "+ s.lengthOfLastWord(" fly me to the moon "));
		
		System.out.println(" Length "+ s.lengthOfLastWord("luffy is still joyboy"));
	 }

	}
