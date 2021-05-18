package week3.day1;

import java.util.Arrays;

public class LearnArrays {
public static void main(String[] args) {
	String name = "Balaji";
	String[] names = {"Ram","Mohan","Kumaran","Deepa","Balaji"};
	int length = names.length;
	for (int i = 0; i < length; i++) {
		System.out.println(names[i]);
	}
	Arrays.sort(names);
	System.out.println("*****************");
	for (String eachName : names) {
		System.out.println(eachName);
	}
	
	
	//System.out.println(names[5]);
	
	
	
		
		  String[] names1 = new String[10]; 
		  names1[0] = "A";
		  names1[5] = "D";
		  
		  for (int i = 0; i < names1.length; i++) {
		  System.out.println(names1[i]); }
		 
}
}
