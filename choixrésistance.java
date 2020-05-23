import java.util.Scanner;

public class choixrésistance {

	public static void main(String[] args) {
		Scanner cr = new Scanner(System.in);
		System.out.println("r1 : ");
		int r1 = cr.nextInt();
		System.out.println("r2 : ");
		int r2 = cr.nextInt();
		System.out.println("r3 : ");
		int r3 = cr.nextInt();
		System.out.println("saisir votre choix : 1 ou 2");
		int vc = cr.nextInt();
		
		if(vc == 1){
		int r = r1+r2+r3;
		System.out.println("la fréquence est en série, sa valeur est : " + r);
	
		}
		else if (vc==2){
			int rp = (r1*r2*r3)/(r1*r2)+(r2*r3)+(r1*r3);
			System.out.println("la fréquence est en parallèle, sa valeur est : " + rp);
		}
	}

}
