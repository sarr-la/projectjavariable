import java.util.Scanner;

public class durée {

	public static void main(String[] args) {
		Scanner dur = new Scanner(System.in);
		System.out.println("entrer h1: ");
		int h1 = dur.nextInt();
		System.out.println("entrer m1: ");
		int m1 = dur.nextInt();
		System.out.println("entrer h2: ");
		int h2 = dur.nextInt();
		System.out.println("entrer m2: ");
		int m2 = dur.nextInt();
		if(m2>m1) {
			int hd = h2 -h1;
			int md = m2-m1;
			System.out.println("la durée de vol heure:" + hd);
			System.out.println("la durée de vol en minute:" + md);
		}
		else if("" != null) {
			int hd = h2-h1-1;
			int md = m2+60-m1;
			System.out.println("la durée de vol en heure:" + hd);
			System.out.println("la durée de vol en minute:" + md);
		}
	}

}
