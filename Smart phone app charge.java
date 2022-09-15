import java.util.Arrays;
import java.util.Scanner;
public class programming {
	public static void main(String args[]) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long[] arr = new Long[n];
		Long max =(long) -1;
		
		
		for (int i=0;i<n;i++) {
			arr[i] = sc.nextLong();
		}
		Arrays.sort(arr);
		for (int i=0;i<n;i++) {
			if (max<arr[i]*(n-i)) {
				max = arr[i]*(n-i);
			}
		}
		System.out.println(max);
		
		sc.close();
	}
}
