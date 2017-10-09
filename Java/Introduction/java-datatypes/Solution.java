import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // # of test cases
        
        for(int x = 0; x < t; x++) {
            try {
                long l = sc.nextLong();
                System.out.println(l+" can be fitted in:");
                
                if((l >= -128) && (l <= 127))
                    System.out.println("* byte");
                if((l >= -32768) && (l <= 32767))
                    System.out.println("* short");
                if((l >= -1*Math.pow(2, 31)) && (l <= (Math.pow(2, 31)-1)))
                    System.out.println("* int");
                if((l >= -1*Math.pow(2, 63)) && (l <= (Math.pow(2, 63)-1)))
                    System.out.println("* long");                
            }
            catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}