//You are climbing a staircase. It takes n steps to reach the top.Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? 

import java.io.IOException;
import java.util.*;
public class second {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			if(n<=2) {
				System.out.println(n);
			}
			else {
				int[] dp = new int[n+1];
				dp[1]=1;
				dp[2]=2;
				for (int i=3;i<=n;i++) {
					dp[i]=dp[i-1]+dp[i-2];
				}
				System.out.println(dp[n]);
			}
			
		}	
		sc.close();
	}
} 
