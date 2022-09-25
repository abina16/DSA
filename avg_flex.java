//using binary search
//codechef problem: https://www.codechef.com/problems/AVGFLEX

import java.io.IOException;
import java.util.*;
public class second {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] mrk = new int[n];
			
			for (int i=0;i<n;i++) {
				mrk[i]=sc.nextInt();
			}
			Arrays.sort(mrk);
			
			int medi = mrk[n/2];
			int pos = n/2;
			for (int i=0;i<=n/2;i++) {
				if (medi == mrk[i]) {
					pos=i;
					break;
				}
			}
			System.out.println(n-pos);
		}
		sc.close();
	}
} 
