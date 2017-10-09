import java.util.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        // Define Strings to hold 'smallest' and 'largest' values
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        smallest = s.substring(0, k);
        largest = smallest;
        String current;

        for(int i = 1; i < (s.length()-k+1); i++) {
            current = s.substring(i, i+k);
            if(current.compareTo(smallest) < 0)
                smallest = current;
            if(current.compareTo(largest) > 0)
                largest = current;
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}