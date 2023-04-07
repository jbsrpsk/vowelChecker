package com.gpr.apps;

import java.util.Scanner;

class Main
{
	static void vowelCheck(String a) {
		int counter =0;
		for(int i=0;i< a.length();i++) {
			char k = a.charAt(i);
			if(k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u'){
				System.out.print(k+" ");
				counter++;
			}
	}
		System.out.println();
		System.out.println("vowel counter: "+counter);
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String z = scan.nextLine();
		vowelCheck(z);
}
}
 