// codechef solution:https://www.codechef.com/LRNDSA05/problems/HMAPPY2

import java.util.Scanner;
public class programming {
	public static void main(String args[]) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			long k  =sc.nextLong();

			long g = gcd(a,b);
			long lcm = (a*b)/g;
			long ans= (n/a)+(n/b)-(n/lcm)-(n/lcm);
			
			if (ans>=k) {
				System.out.println("Win");
			}
			else {
				System.out.println("Lose");
			}
		}
		sc.close();
	}
	static long gcd(long a,long b) {
		if (b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}
}
