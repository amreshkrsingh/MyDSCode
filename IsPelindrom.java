//$Id$
package com.amresh;

public class IsPelindrom {

	public static void main(String[] args) {
		
		System.out.println(isPelindrom(52377325));
	}
	
	public static boolean isPelindrom(int number) {
		String numST = String.valueOf(number);
		int half = (numST.length())/2;
		for (int i=0, j=numST.length()-1; i<=half && j>=half; i++, j--) {
			if(numST.charAt(i) != numST.charAt(j)) {
				return false;
			}
//			System.out.println("I = "+numST.charAt(i));
//			System.out.println("J = "+numST.charAt(j));
		}
		return true;
	}
	
	
	
	// method to find the number of digits present in the number n  (It's just for my reference in this class)
	public int countDig(int n) {  
		int count = 0;  
		while(n != 0) {  
			// removing the last digit of the number n  
			n = n / 10;  
			// increasing count by 1  
			count = count + 1;  
		}  
		return count;  
	}  

}
