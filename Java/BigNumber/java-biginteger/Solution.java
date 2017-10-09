import java.util.*;
import java.math.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BigInteger bi1 = sc.nextBigInteger();
        BigInteger bi2 = sc.nextBigInteger();
        
        System.out.println(bi1.add(bi2));
        System.out.println(bi1.multiply(bi2));        
    }
}