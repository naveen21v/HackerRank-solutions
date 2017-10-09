import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int a, b, n;
        for(int i = 0; i < q; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            
            int value = a;
            for(int j = 0; j < n; j++) {
                value += b * Math.pow(2, j);
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}