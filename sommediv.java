import java.util.Scanner;

public class sommediv {

	public static void main(String[] args) {
		Scanner sdv = new Scanner (System.in);
		System.out.println("entrer un nombre: ");
		int nbr = sdv.nextInt();
		int somme = 0;
		for(int i=1;i<=(nbr-1);i++){
			if(nbr%i==0) {
				 somme = (int)somme+1;
			}
			if (nbr==somme) {
				System.out.println("ce nombre est parfait:");
			}
			
	}

}
}