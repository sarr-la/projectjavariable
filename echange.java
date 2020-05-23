import java.util.Scanner;

public class echange {

	public static void main(String[] args) {
		Scanner ech = new Scanner(System.in);
		System.out.println("entrer un montant: ");
		int montant = ech.nextInt();
		int b20 = (int)montant/(int)20;
		int reste = montant % 20;
	    reste = montant-(20*b20);
		int b10 = reste/10;
	    reste = (int) reste %10;
	    int b5 = (int)reste /5;
	    reste = reste %5;
	    int b2 = reste /2;
	    reste = reste %2;
	    int  b1 = reste /1;
	    reste = reste %1;
	    System.out.println("afficher le montant:" + montant);
	    System.out.println("billet de 20:" + b20);
	    System.out.println("billet de 10:" + b10);
	    System.out.println("billet de 5:" + b5);
	    System.out.println("billet de 2:" + b2);
	    System.out.println("billet de 1:" + b1);
	  
		
		
		
		
	}

}
