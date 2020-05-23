import java.util.Scanner;

public class somme {

	public static void main(String[] args) {
		Scanner sm = new Scanner(System.in);
			System.out.println("donner un nombre : ");
			int nombre = sm.nextInt();
			int somme = 0;
			for(int i=1; i<=5; i++) {
		     somme = (int) somme + nombre;
			System.out.println("la somme des nombres est : " + somme);
			}
			}
}
