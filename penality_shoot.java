// code solution:  https://www.codechef.com/LRNDSA02/problems/PSHOT

import java.util.Scanner;
public class programming {
	public static void main(String args[]) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String s = sc.next();
			Boolean flag = false;
			int a =0,b=0;
			int ra=n,rb=n;
			
			for (int i=0;i<2*n;i++) {
				if (i%2!=0) {
					if (s.charAt(i)=='1') {
						a++;
					}
					ra--;
				}
				else {
					if (s.charAt(i)=='1') {
						b++;
					}
					rb--;
				}
				
				if (a>rb+b) {
					flag = true;
					System.out.println(i+1);
					break;
				}
				else if (b>ra+a){
					flag = true;
					System.out.println(i+1);
					break;
				}
			}
			if (!flag) {
				System.out.println(2*n);
			}
		}
		sc.close();
	}
}
