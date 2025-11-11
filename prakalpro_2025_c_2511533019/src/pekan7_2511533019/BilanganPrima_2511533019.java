package pekan7_2511533019;

import java.util.Scanner;

public class BilanganPrima_2511533019 {

	public static boolean isPrime (int n) {
		// TODO Auto-generated method stub
		int factors = 0;
		for (int i=1; i<=n ; i++) {
			if (n%i==0) {
				factors++;
				
			}
		}
		return (factors==2);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input nilai n = ");
		int a = input.nextInt();
		if (isPrime(a)) {
			System.out.println(a+" bilangan prima");
		}else
			System.out.println(a+" bukan bilangan prima");
	}
}
