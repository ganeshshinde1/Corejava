package com.csi.duplicationcharachter;

import java.util.Set;
import java.util.TreeSet;

public class DuplicationCharachter {
public static void main(String[] args) {
	String ic = "Pratap";
	String inputString= ic.toLowerCase();
	char[] originalChar = inputString.toCharArray();
	Set uniqChar = new TreeSet<>();
	Set dupChar = new TreeSet<>();
	
	for (char ch:originalChar){
		if (dupChar.add(ch)==false){
			uniqChar.add(ch);
		}
	}
	uniqChar.forEach(System.out::println);
}
}
