import java.util.Scanner;

public class Résistance {

	public static void main(String[] args) {
		Scanner rs = new Scanner(System.in);
		System.out.println("r1 : ");
		int r1 = rs.nextInt();
		System.out.println("r2 : ");
		int r2 = rs.nextInt();
		System.out.println("r3 : ");
		int r3 = rs.nextInt();
		int r = r1+r2+r3;
		System.out.println("la fréquence est en série, sa valeur est : " + r);
		int rp = (r1*r2*r3)/(r1*r2+r2*r3+r1*r3);
		System.out.println("la fréquence est en parallèle, sa valeur est : " + r);
		
	}

}
