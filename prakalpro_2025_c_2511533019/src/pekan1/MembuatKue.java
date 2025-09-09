package pekan1;

public class MembuatKue {

	public static void main(String[] args) {
		makeBatter();
		memanggang ();
		memanggang ();
		menghias ();
	}
//langkah 1 : buat adonan kue.
	public static void makeBatter() {
		System.out.println("campur bahan kering.");
		System.out.println("krim mentega dan gula.");
		System.out.println("kocok telurnya.");
		System.out.println("masukkan bahan kering.");
	}
//langkah 2 : panggang sekumpulan kue.
	public static void memanggang() {
		System.out.println("setel suhu oven.");
		System.out.println("setel pengatur waktu.");
		System.out.println("masukkan kue ke dalam oven.");
		System.out.println("biarkan cookie untuk dipanggang.");
	}
//langkah 3 : hiasi cookie
	public static void menghias () {
		System.out.println("campur bahan untuk frosting.");
		System.out.println("taburkan frosting dan taburan.");
	}
}
