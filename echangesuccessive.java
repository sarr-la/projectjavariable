import java.util.Scanner;

public class echangesuccessive {

	public static void main(String[] args) {
		Scanner echs = new Scanner(System.in);
		System.out.println("entrer A: ");
		int A = echs.nextInt();
		System.out.println("entrer B: ");
		int B = echs.nextInt();
		System.out.println("entrer C: ");
		int C = echs.nextInt();
		if(A>B) {
			
			int n = A;
			 A = C;
			 C = n;
		}
		if(B>C) {
			int n =B;
			B = C;
			C = n;
			System.out.println("A:" + A);
			System.out.println("B:" + B);
			System.out.println("C:" + C);
			
		}
	}

}
