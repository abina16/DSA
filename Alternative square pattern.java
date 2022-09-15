import java.util.Scanner;
public class programming {
	public static void main(String args[]) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int check =1;
		int round=0;
		while(check<=n) {
			if (check%2==0) {
				for (int i=round+5;i>=round+1;i--) {
					System.out.print(i+" ");
				}
				round+=5;
				System.out.println();
			}
			else {
				for (int i=round+1;i<=round+5;i++) {
					System.out.print(i+" ");
				}
				round+=5;
				System.out.println();
			}
			check++;
		}
		sc.close();
	}
}
