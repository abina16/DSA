//To find all the different substring available for an array

import java.util.ArrayList;
public class programming {
	static void sub(int ind ,ArrayList<Integer> ans,ArrayList<Integer> arr,int n){
		if (ind==n) {
			for (int i=0;i<ans.size();i++) {
				System.out.print(ans.get(i)+" ");
			}
			System.out.println();
			if(ans.size()==0) {
				System.out.print("[]");
			}
			return;
		}
		ans.add(arr.get(ind));
		sub(ind+1,ans,arr,n);
		ans.remove(ans.size()-1);
		sub(ind+1,ans,arr,n);
	}
	public static void main(String args[]) throws java.lang.Exception {
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(1);
		arr.add(2);
		
		sub(0,ans,arr,3);
	}
}


// To find a single substring which satisfies a condition that the sum of the elements in that substring equals 2.

import java.util.ArrayList;
public class programming {
	static Boolean sub(int ind ,ArrayList<Integer> ans,int s,int sum,ArrayList<Integer> arr,int n){
		if (ind==n) {
			if(s==sum) {
				for (int i=0;i<ans.size();i++) {
					System.out.print(ans.get(i)+" ");
				}
				System.out.println();
				return true;
			}
			else{
				return false;
			}
			
		}
		ans.add(arr.get(ind));
		s+=arr.get(ind);
		
		
		if (sub(ind+1,ans,s,sum,arr,n)==true) {
			return true;
		}
		
		s-=arr.get(ind);
		
		ans.remove(ans.size()-1);
		if (sub(ind+1,ans,s,sum,arr,n)==true) {
			return true;
		}
		return false;
	}
	public static void main(String args[]) throws java.lang.Exception {
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(1);
		int n =3;
		int sum = 2;
		sub(0,ans,0,sum,arr,n);
	}
}


// To count all the substring of an array which has a sum of 2

import java.util.ArrayList;
import java.util.Scanner;
public class programming {
	static int  count(ArrayList <Integer> arr,int ind,int n,int sum,int s){
		if (ind==n) {
			if (sum==s) {
				return 1;
			}
			else {
				return 0;
			}
		}
		s+=arr.get(ind);
		int l = count (arr,ind+1,n,sum,s);
		
		s-=arr.get(ind);
		int r = count (arr,ind+1,n,sum,s);
		
		return l+r;
	}
	
	public static void main(String args[]) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			ArrayList <Integer> arr = new ArrayList<Integer>();
			arr.add(1);
			arr.add(2);
			arr.add(1);
			int ind = 0;
			int n = arr.size();
			int sum=2;
			int s =0;
			
			System.out.println(count(arr,ind,n,sum,s));
		}
		sc.close();
		
	}
}
