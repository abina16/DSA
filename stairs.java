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

//You are given an integer array cost where cost[i] is the cost of ith step on a staircase. 
//Once you pay the cost, you can either climb one or two steps.You can either start from the step with index 0, or the step with index 1.
//Return the minimum cost to reach the top of the floor.

import java.io.IOException;
import java.util.*;
public class second {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int cost[] = new int[n];
			for (int i=0;i<n;i++) {
				cost[i] = sc.nextInt();
			}
			int dp[] = new int[n];
			
			dp[0]=cost[0];
			dp[1] = cost[1];
			
			for (int i=2;i<n;i++) {
				dp[i]=Math.min(dp[i-1], dp[i-2])+cost[i];
			}
			System.out.println(Math.min(dp[n-1], dp[n-2]));
			
		}	
		sc.close();
	}
} 
