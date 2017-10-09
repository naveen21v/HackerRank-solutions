import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        StringBuffer sba = new StringBuffer(a.toLowerCase());
        StringBuffer sbb = new StringBuffer(b.toLowerCase());
        char c;
        int i;
        int d;
        for(i = 0; (i < sba.length()) && (sbb.length() != 0); i++) {
            // Get the next character from StringBuffer sba
            c = sba.charAt(i);
            
            // Get its index
            d = sbb.indexOf(String.valueOf(c));
            
            // If same character not found in StringBuffer sbb,
            // then it's not an Anagram, so break.
            if(d == -1)
                break;
            
            // Delete the corresponding character from 
            // StringBuffer sbb
            sbb.deleteCharAt(d);
        }
        
        /* If all characters from StringBuffer sba are iterated and 
           if all characters from StringBuffer sbb are deleted,
           then Anagram otherwise no. 
        */
        return (i == sba.length() && sbb.length() == 0)?true:false;
    }
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );        
    }
}