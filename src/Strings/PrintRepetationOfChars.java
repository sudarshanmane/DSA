package Strings;

import java.util.LinkedList;
import java.util.List;

class PrintRepetationOfChars {
	
	public static void reverseString(String name) {
		
		List<String> listOfChars = new LinkedList<>();
		
		for(int i = 0;i<name.length();i++) {
			
			char namesChar = name.charAt(i);
			int count = 1;
			
			for(int k = 0;k<name.length();k++){
				if(i != k && !listOfChars.contains("" + namesChar) && (namesChar == name.charAt(k))) {
					count ++;
				}	
			}
			
			if(!listOfChars.contains("" + namesChar)){
				listOfChars.add("" + namesChar);
				System.out.print( namesChar + " : " + count );
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		reverseString("sudarshan mane");		
	}

}
