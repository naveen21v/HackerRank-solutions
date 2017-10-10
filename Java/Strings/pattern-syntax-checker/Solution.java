import java.util.*;
import java.util.regex.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s[] = new String[N];
		
		// discard the newline character immediat
		sc.nextLine();
		
		for(int i = 0; i < N; i++) {
			s[i] = sc.nextLine();
		}
		
		for(String regExpression : s) {
			try {
				Pattern p = Pattern.compile(regExpression);				
			} catch(PatternSyntaxException pse) {
				System.out.println("Invalid");
				continue;
			}
			System.out.println("Valid");
		}		
	}
}