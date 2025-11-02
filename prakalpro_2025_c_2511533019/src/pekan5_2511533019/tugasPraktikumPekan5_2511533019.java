package pekan5_2511533019;

public class tugasPraktikumPekan5_2511533019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("#");
		for (int i = 0; i < 16; i++) 
			System.out.print("=");
        	System.out.println("#");
        	
		for (int line=1;line<=4; line++) {
			System.out.print("|");
			for(int j = 1; j <=4-line; j++){
                System.out.print("  ");
			}
			System.out.print("<>");
				for (int d=1; d<=(line-1)*2; d++){
	              	System.out.print("..");
	            }
	            	   System.out.print("<>");
	            		for (int e = 1; e <= 4 - line; e++)
	            		  System.out.print("  ");
	            			System.out.println ("|");}
		
		for(int line = 4; line >= 1; line--){
			System.out.print("|");
         		for(int k=1; k<=4-line; k++){
                      System.out.print("  ");
               }
            System.out.print("<>");
            	for(int d= 1; d<=(line - 1)*2;d++){
                System.out.print("..");}

         System.out.print("<>");
        	for (int e = 1; e <= 4 - line; e++)
        		System.out.print("  ");
        			System.out.println ("|");}
            
		System.out.print("#");
		for (int i = 0; i < 10 + 6; i++) 
			System.out.print("=");
        		System.out.println("#");
		}
	}
