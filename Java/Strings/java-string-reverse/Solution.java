import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println((s.equals(reversed))?"Yes":"No");
    }
}