import java.util.Scanner;

public class equation2nddegré {

	private static final int D = 0;

	public static void main(String[] args) {
		Scanner eq = new Scanner(System.in);
		System.out.println("entrer a: ");
		int a = eq.nextInt();
		System.out.println("entrer b: ");
		int b = eq.nextInt();
		System.out.println("entrer c: ");
		int c = eq.nextInt();
		if(a == 0 && b==0) {
			System.out.println("écrire pas de solution: ");
		}
		else if("" != null) {
			
			System.out.println("une solution: " + (-c/b));
			}
		else if("" != null) {
			int D = (b*b)-(4*a*c);
		}
		if(D<0){
			System.out.println("aucune solution: ");
		}
		if("" != null) {
			System.out.println("une solution: " + (-b/(2*a)));
		}
		else if("" != null){
			System.out.println("deux solutions:" + (-(b-(Math.sqrt(D)/(2*a)))));
			System.out.println("deux solutions:" + (-(b+(Math.sqrt(D)/(2*a)))));
		}
	}

}
