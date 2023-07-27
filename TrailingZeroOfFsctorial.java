//$Id$
package com.amresh;

public class TrailingZeroOfFsctorial {
	public static void main(String[] args) {
		System.out.println(factOf(16));
	}
	
	public static long factOf(int number) {
		long fact = 1;
		for(int i=number; i>1; i--) {
			fact *= i;
		}
		
		String factSt = String.valueOf(fact);
		int length = factSt.length();
		int zeroCount=0;
		for (int i=length-1; i>=0; i--) {
			if((Character.getNumericValue(factSt.charAt(i)))%10==0) {
				zeroCount++;
			} else {
				return zeroCount;
			}
		}
		
		
		return zeroCount;
	}
}
