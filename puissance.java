import java.util.Scanner;

public class puissance {

	public static void main(String[] args) {
		Scanner expo = new Scanner(System.in);
		System.out.println("r1 : ");
		int x = expo.nextInt();
		System.out.println("r2 : ");
		int n = expo.nextInt();
		int puissance_x = (int) Math.pow(x, n);
		System.out.println("la puissance_x est :" +puissance_x);
		
	}

}
