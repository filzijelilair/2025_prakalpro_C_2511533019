package pekan7_2511533019;

import java.util.Scanner;

public class panggilMahasiswa2_2511533019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("NIM: ");
		String x = input.nextLine();
		System.out.print("Nama: ");
		String y= input.nextLine();
		Mahasiswa_2511533019 a= new Mahasiswa_2511533019();
		a.setNim2(x);
		a.setNama(y);
		if (a.getNim2().startsWith("25")) {
			System.out.println(a.getNama()+ " anda angkatan 2025");
		}
		if (a.getNim2().contains("1153")) {
			System.out.println("Anda merupakan mahasiswa Informatika");
			
		}
		a.Cetak2();
		input.close();
	}

}
