import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String snew = s.trim();
        sc.close();
        
        String[] arr = snew.split("[ !,?._'@]+");
        
        if(snew.length() == 0) {
            System.out.println(0);
        }
        else {
            System.out.println(arr.length);
            
            for(int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}