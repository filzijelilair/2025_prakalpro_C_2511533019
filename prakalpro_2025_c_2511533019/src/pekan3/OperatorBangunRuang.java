package pekan3;
import java.util.Scanner;
public class OperatorBangunRuang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mencari Volume Tabung
		final double PI = 3.14;
		int r; //jari-jari tabung
		int t; //tinggi tabung
		double volume;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input jari-jari tabung: ");
		r= keyboard.nextInt ();
		System.out.print("Input tinggi tabung: ");
		t = keyboard.nextInt();
		keyboard.close ();
			
		volume = PI * r * r * t;
		System.out.println ("Volume Tabung ="+volume);	
	}

}
 