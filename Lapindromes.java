import java.util.HashMap;
import java.util.Scanner;
public class programming {
	public static void main(String args[]) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			HashMap<Character,Long> arr1 = new HashMap<>();
			HashMap<Character,Long> arr2 = new HashMap<>();
			long r,l;
			long val;
			
			// r is the limit from front
			// l is the limit from back
			
			if (s.length()%2!=0) {
				r=(s.length()/2)+1;
				l=r-1;
			}
			else {
				r = s.length()/2;
				l=r;
			}
		
			boolean flag = true;
			
			for (int i=0;i<l;i++){
				char alp = s.charAt(i);
				if (arr1.containsKey(alp)) {
					val = arr1.get(alp);
					arr1.replace(alp, val+1);
				}
				else {
					arr1.put(alp, (long) 1);
				}
			}

			for(int i=s.length()-1;i>=r;i--) {
				char alp = s.charAt(i);
				if (arr2.containsKey(alp)) {
					val = arr2.get(alp);
					arr2.replace(alp, val+1);
				}
				else {
					arr2.put(alp, (long) 1);
				}
			}
			
			
			for(int i=0;i<(s.length()/2)+1;i++) {
				for (Character key :arr2.keySet()) {
					if(!(arr1.containsKey(key) && (arr1.get(key)==arr2.get(key)))) {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			
		}
		sc.close();
	}
}
