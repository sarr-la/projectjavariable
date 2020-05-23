import java.util.Scanner;

public class distance {

	public static void main(String[] args) {
		Scanner ds = new Scanner(System.in);
		System.out.println("donner l'abscisse du point A: ");
		int x1 = ds.nextInt();
		System.out.println("donner l'ordonnée du point A: ");
		int x2 = ds.nextInt();
		System.out.println("donner l'abscisse du point B: ");
		int y1 = ds.nextInt();
		System.out.println("donner l'ordonnée du point B: ");
		int y2 = ds.nextInt();
	    int Distance = (int) Math.sqrt(x1-x2)*2  + (y1-y2)*2;
	System.out.println("la distance entre le point A et B est égale: " + Distance);
	}

}