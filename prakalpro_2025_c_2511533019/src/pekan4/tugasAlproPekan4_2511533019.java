package pekan4;

import java.util.Scanner;

public class tugasAlproPekan4_2511533019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sistem Pembelian Tiket Bioskop
		String NamaPembeli;
		int JumlahTiket;
		
		Scanner input = new Scanner(System.in);
		System.out.println("===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.print("Nama Pembeli : ");
        NamaPembeli = input.nextLine();

        System.out.print("Jumlah Tiket : ");
        JumlahTiket = input.nextInt();

        System.out.println("Pilih Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu):");
        int Hari = input.nextInt();

        System.out.println("Pilih Waktu Tayang (1=Pagi, 2=Siang, 3=Malam):");
        int Waktu = input.nextInt();

        System.out.println("Pilih Jenis Studio (1/2/3):");
        int studio = input.nextInt();

        double hargaDasar = 45000;
        double biayaHari = 0;
        double biayaWaktu = 0;

        // Biaya tambahan Hari
        switch (Hari) {
            case 1: biayaHari = 0.0; // Senin-Kamis
            break;           
            case 2: biayaHari = 0.15; // Jumat +15%
            break;          
            case 3: biayaHari = 0.30; // Sabtu-Minggu +30%
            break;          
         default: 
            	System.out.println("Input hari tidak valid!"); 
            	return;
        }

        // Biaya tambahan Waktu tayang
        switch (Waktu) {
            case 1: biayaWaktu = 0.0;  // Pagi
            break;          
            case 2: biayaWaktu = 0.10; // Siang +10%
            break;        
            case 3: biayaWaktu = 0.15; // Malam +15%
            break;         
         default: 
            	System.out.println("Input waktu tidak valid!"); 
            	return;
        }

        // Hitung harga per tiket
        double hargaPerTiket = 
        		(hargaDasar + (hargaDasar*biayaHari) + ( hargaDasar*biayaWaktu));

        double subtotal = hargaPerTiket * JumlahTiket;
        double diskon = 0;

        // Diskon jika beli >= 5 tiket
        if (JumlahTiket >= 5) {
            diskon = subtotal * 0.20;
        }

        double total = subtotal - diskon;

        // Output
        System.out.println("--------------------------------------");
        System.out.println("Nama Pembeli: " + NamaPembeli);
        System.out.println("Jumlah Tiket: " + JumlahTiket);
        System.out.print("Hari: ");
        switch (Hari) {
            case 1: System.out.println("Senin-Kamis"); 
            break;
            case 2: System.out.println("Jumat"); 
            break;
            case 3: System.out.println("Sabtu-Minggu"); 
            break;
        }
        System.out.print("Waktu Tayang:");
        switch (Waktu) {
            case 1: System.out.println("Pagi"); 
            break;
            case 2: System.out.println("Siang"); 
            break;
            case 3: System.out.println("Malam"); 
            break;
        }
        System.out.print("Jenis Studio:");
        // Jenis studio
        switch (studio) {
        	case 1: System.out.println("Regular");
			break;         
            case 2: System.out.println("Deluxe"); 
            break;      
            case 3: System.out.println("Premium");
            break;      
         default: 
            	System.out.println("Input studio tidak valid!"); 
            	return;
        }
        System.out.println("--------------------------------------");
        
        System.out.println("Harga Dasar : Rp " + (int)hargaDasar + "/tiket");
        System.out.println("Biaya Hari : +" + (int)(biayaHari*100) + "%");
        System.out.println("Biaya Waktu : +" + (int)(biayaWaktu *100) + "%");
        System.out.println("Harga per Tiket : Rp " + (int)hargaPerTiket);
        System.out.println("Subtotal : Rp " + (int)subtotal);
        System.out.println("Diskon (20%): Rp " + (int)diskon);
        System.out.println("--------------------------------------");
        System.out.println("TOTAL BAYAR: Rp " + (int)total);

        input.close();
	}

}
