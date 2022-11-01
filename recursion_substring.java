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
		ans.remove(ans.remove(ans.size()-1));
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
