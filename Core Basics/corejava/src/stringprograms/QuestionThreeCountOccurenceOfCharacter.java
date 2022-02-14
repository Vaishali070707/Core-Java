package com.stringprograms;

public class QuestionThreeCountOccurenceOfCharacter {
	public static void main(String[] args) {
		String S="Vaishali";
		char c ='a';
		int count=0;
		int i;
		for(i=0;i<S.length();i++)
		{
			if(c==S.charAt(i)) {
				count++;
					} 
			
		}
		System.out.println(count);
	}


}
