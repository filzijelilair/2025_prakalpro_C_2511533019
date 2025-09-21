package pekan2;

public class TugasAlproPekan2 {
    static float RataRataNilai;//variabel menyimpan nilai rata-rta 

    public static void main(String[] args) {
        int nilaiInformatika;
        int nilaiMTK;
        int nilaiBiologi;
        int nilaiKimia;
        char kelas;
        boolean isLulus;

        // pengisian variabel
        nilaiInformatika= 97;
        nilaiMTK= 92;
        nilaiBiologi= 98;
        nilaiKimia= 97;
        kelas = 'A';
        
        //hitung nilai rata-rata
        RataRataNilai = (nilaiInformatika + nilaiMTK + nilaiBiologi + nilaiKimia) / 4;
        
        //cek kelulusan
        isLulus = RataRataNilai >= 94; // true jika rata-rata >= 94

        // output
        System.out.println("Kelas           : " + kelas);
        System.out.println("Rata-rata Nilai : " + RataRataNilai);
        System.out.println("Status Kelulusan: " + isLulus);
    }
}