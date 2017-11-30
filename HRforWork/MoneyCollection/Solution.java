import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
	static BigInteger maxMoney(BigInteger n, BigInteger k) {
		BigInteger modNum = BigInteger.TEN.pow(9).add(new BigInteger("7")); // (10e9 + 7)
		BigInteger maxSum = BigInteger.ZERO; // initialize to zero
		//System.out.println("modNum = " + modNum);
		
		
		
		return (maxSum.mod(modNum));
		
	}
	
	public static void main(String args[]) {
		BigInteger n; // total number of integers to sum
		BigInteger k; // number to be excluded from summation
		BigInteger maxSum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of integers to sum: ");
		
		n = sc.nextBigInteger();
		
		System.out.println("Enter the number to be excluded from summation: ");
		k = sc.nextBigInteger();
		
		sc.close();
		
		maxSum = maxMoney(n, k);
		
		System.out.println("Max Summation = "+maxSum);
		
		
	}
}