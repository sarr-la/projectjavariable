import java.util.Scanner;

public class operation {

	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		System.out.println("entrer a: ");
		int a = op.nextInt();
		System.out.println("entrer o: ");
		int o = op.nextInt();
		System.out.println("entrer b: ");
		int b = op.nextInt();
if (o =='-'){
	System.out.println("le résultat est de:" +("a'-'b"));
}

	if (o =='+'){
		System.out.println("le résultat est de:" +("a'+'b"));
	}
	if (o =='*'){
		System.out.println("le résultat est de:" +("a'*'b"));
	}
	if (o =='/'){
		System.out.println("le résultat est de:" +("a'/'b"));
	}}}
