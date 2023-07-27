//$Id$
package com.zoho.ds;

import java.util.Scanner;

// LCM (Lagutam - Least Common Multiple) - wo chota number jo diye gaye numbers se cut jaye.
// HCF (Mahatam - Highest Common factor) - wo bara number jis se diye gaye numbers puri tarah kat jaye.

public class LCF_HCF {
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int firstNum = scaner.nextInt();
		System.out.println("Enter the Second numbers : ");
		int secondNum = scaner.nextInt();
		if(firstNum < secondNum) {
			firstNum = firstNum;
			secondNum = secondNum;
		}else {
			int swap = firstNum;
			firstNum = secondNum;
			secondNum = swap;
		}
		System.out.println("LCM => "+getLCM(firstNum, secondNum));
		System.out.println();
		System.out.println();
		System.out.println("HCF =>  "+getHCF(firstNum, secondNum));
	}
	
	public static int getLCM(int num1, int num2) {
		int result = 0;
		for (int i=num2; i<= num2*num1; i++) {
			if(i%num1 == 0 && i%num2 == 0) {
				result = i;
				return result;
			}
		}
		return result;
	}
	public static int getHCF(int num1, int num2) {
		int result = 0;
		
		for (int i=num1; i>0 ; i--) {
			if(num1%i == 0 && num2%i == 0) {
				result = i;
				return result;
			}
		}
		return result;
	}
}
