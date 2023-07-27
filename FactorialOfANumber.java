//$Id$
package com.amresh;

public class FactorialOfANumber {

	public static void main(String[] args) {
		System.out.println(getFact(16l));

	}
	
	private static Long getFact(Long n) {
		Long result=1l;
		for (Long i = n; i > 1; i--) {
			result *= i;
		}
		return result;
	}

}
