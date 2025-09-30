package pekan4;

import java.util.Scanner;

public class multiIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int umur;
		char SIM;
		Scanner a = new Scanner(System.in);
		System.out.println("input umur anda:");
		umur = a.nextInt();
		System.out.println("apakah anda sudah punya SIM?");
		SIM = a.next().charAt(0);
		a.close();
			if((umur >= 17)&& (SIM == 'y')) {
				System.out.print("anda sudah dewasa dan boleh bawa motor");
			}
			if ((umur >= 17 )&& (SIM == 'y')) {
				System.out.print("anda sudah dewasa tetapi tidak boleh bawa motor");
			}
			if ((umur < 17)&& (SIM != 'y')) {
				System.out.print("anda belum cukup umur untuk bawa motor");
			}
			if ((umur <18)&& (SIM == 'y')) {
			System.out.print("anda belum cukup umur punya SIM");
		}

	}
}
