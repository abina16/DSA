//codechef solution:  https://www.codechef.com/LRNDSA02/problems/COMPILER

import java.util.Scanner;
public class programming {
	public static void main(String args[]) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			int c =0;
			int total =0;
			
			for (int i=0;i<s.length();i++) {
				if (s.charAt(i)=='<') {
					c++;
				}
				else {
					c--;
					if (c<0) {
						break;
					}
					
				}
				if (c==0) {
					total =i+1;
				}
			}
			System.out.println(total);
		}
		sc.close();
	}
}
