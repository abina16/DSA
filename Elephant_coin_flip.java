//solution to this codechef problem:   https://www.codechef.com/LRNDSA01/problems/CONFLIP

import java.util.Scanner;
public class programming {
	public static void main(String args[]) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int g = sc.nextInt();
			while(g-->0) {
				int i = sc.nextInt();
				int n = sc.nextInt();
				long q = sc.nextInt();
				
				long head,tail;
				if (i==1) {
					head = n/2;
					tail = n-(n/2);
				}
				else {
					head = n-(n/2);
					tail = n/2;
				}
	
				if (q==1) {
					System.out.println(head);
				}
				else {
					System.out.println(tail);
				}
			}
		}
		sc.close();
	}
}
