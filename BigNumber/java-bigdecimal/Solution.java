import java.util.*;
import java.math.*;

public class Solution {
    public static void main(String args[]) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i=0; i<n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        String tempString = "";
        
        //*******
        for(int z=0; z<n; z++) {
            System.out.print(s[z]+" ");
        }        
        //******
        
        //Sort the array in descending order
        for(int i=(n-1); i>0; i--) {
            System.out.println();
            System.out.println("Pass"+(n-i));
            for(int j=(n-1); j>(n-i-1); j--) {
                BigDecimal b1 = new BigDecimal(s[j]);
                BigDecimal b2 = new BigDecimal(s[j-1]);
                // Compare and check b1 > b2 i.e. result of 1
                if(b1.compareTo(b2) == 1) {
                    //exchange s[j] and s[j+1]
                    tempString = s[j];
                    s[j] = s[j-1];
                    s[j-1] = tempString;
                }
                //*******
                System.out.println();
                for(int z=0; z<n; z++) {
                    System.out.print(s[z]+" ");
                }        
                //******               
            }
        }
        
        System.out.println();
        System.out.println("Sorted Output:");
       

        //Output
        for(int i=0; i<n; i++) {
            System.out.println(s[i]);
        }
    }
}