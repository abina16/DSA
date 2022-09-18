// codechef solution:  https://www.codechef.com/LRNDSA02/problems/STUPMACH

import java.util.Scanner;
public class programming {
	public static void main(String args[]) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int min = Integer.MAX_VALUE;
			long ans = 0;
			while(n-->0) {
				min = Math.min(sc.nextInt(), min);
				ans+=min;
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
