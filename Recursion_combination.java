// Given an distinct integer array and a target, find the elements which can be added to get the target. NOTE: An element can be used as many times as we wanted.

import java.util.ArrayList;
import java.util.Scanner;
public class programming {
	static void combo(int ind,ArrayList<Integer> arr,int t,ArrayList<Integer> ans,ArrayList<Integer> ds){
		if (ind==arr.size()) {
			if (t==0) {
				System.out.println(ds);
			}
			return;
		}
		if(arr.get(ind)<= t) {
			ds.add(arr.get(ind));
			combo(ind,arr,t-arr.get(ind),ans,ds);
			ds.remove(ds.size()-1);
		}
		combo(ind+1,arr,t,ans,ds);
	}
	
	public static void main(String args[]) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		//int t = sc.nextInt();
		//while(t-->0) {
			ArrayList <Integer> ans = new ArrayList<Integer>();
			ArrayList <Integer> ds = new ArrayList<Integer>();
			ArrayList <Integer> arr = new ArrayList<Integer>();
			arr.add(2);
			arr.add(3);
			arr.add(6);
			arr.add(7);
			int t = 7;
			combo(0,arr,t,ans,ds);
		//}
		sc.close();
		
	}
}
