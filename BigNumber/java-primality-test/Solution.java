import java.util.*;
import java.math.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BigInteger bi = sc.nextBigInteger();
        sc.close();
        int certainity = 10000;
        
        //Check for primality
        if(bi.isProbablePrime(certainity))
            System.out.println("prime");
        else
            System.out.println("not prime");
        
    }
}