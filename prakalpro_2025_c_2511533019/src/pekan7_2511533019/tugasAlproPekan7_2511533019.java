package pekan7_2511533019;

import java.util.Scanner;

public class tugasAlproPekan7_2511533019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("=== REGISTRASI AKUN BARU ===");
		System.out.print("Masukkan Username : ");
		String x = input.nextLine();
		System.out.print("Masukkan Password : ");
		String y= input.nextLine();
		System.out.print("Masukkan Email : ");
		String z= input.nextLine();
		System.out.print("Masukkan PIN (4 digit): ");
		int w= input.nextInt();
		Akun_2511533019 a= new Akun_2511533019();
		a.setUsername(x);
		a.setPassword(y);
		a.setEmail(z);
		a.setPinAngka(w);
		
		if (!a.isPasswordValid()) {
			System.out.println("Password harus min 8 karakter!!");
			System.out.println("Silahkan coba lagi.");
		}else if (!a.isEmailValid()) {
			System.out.println("Email tidak valid! wajib mengandung '@' dan '.'!!");
			System.out.println("Silahkan coba lagi.");
		}else {
			System.out.println();
			System.out.println("--- REGISTRASI BERHASIL ---");
			System.out.println("Akun untuk \"username\" telah berhasil dibuat");
			System.out.println();
			System.out.println("--- Detail Akun ---");
			System.out.println("Username (Lowercase)  : "+x.toLowerCase()); 
			System.out.println("Email (Uppercase)     : "+z.toUpperCase());
			System.out.println("ID Pengguna (Gabungan):"+x+w);
			System.out.println();
			System.out.println("--- Uji Tipe Data (PIN Anda: "+w+") ---");
			System.out.println("PIN(int) + 10      ="+(w+10));
			System.out.println("PIN(String) + \"10\" = "+w+"10");
		}
		input.close();
	}

}
