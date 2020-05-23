import java.util.Scanner;

public class puissanceboucle {

	public static void main(String[] args) {
		
		Scanner pb = new Scanner(System.in);
		System.out.println("entrer x : ");
		int x = pb.nextInt();
		System.out.println("entrer n : ");
		int n = pb.nextInt();
   
		for (int i=1;i<=n;i++){
			int puissance_x = (int)Math.pow(x, n);
			System.out.println("x puissance n est: " + puissance_x);
		}
	
	}
}
