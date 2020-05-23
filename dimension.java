import java.util.Scanner;

public class dimension {

	public static void main(String[] args) {
		Scanner ms = new Scanner(System.in);
		System.out.println("rayon : ");
		int rayon = ms.nextInt();
		int surface = (int) (4*Math.atan(2)*rayon*rayon);
				System.out.println("la surface est :" + surface);
		int périmètre = (int)(2*4*Math.atan(2))*rayon;
				System.out.println("le périmètre est :" + périmètre);
		
	}

}
