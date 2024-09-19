package studio3;

import java.util.Scanner;

public class studio_3code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter: n");
		int n = in.nextInt();
		double limit = Math.sqrt(n);
		boolean primeNums[]=new boolean[n];
		//int p = 2;
		for (int i=0; i<n-1; i++) {
			primeNums[i] = true;
			//System.out.println(primeNums[i]);
		
		for(int p = 2; p<limit; p++) {
			for (int j=p*i; j<n; j++) {
				if (p == j){
					primeNums[i] = false;
				}
			System.out.println((primeNums[j]));
			}
	}
		}
	}
}


