import java.util.Scanner;
public class Vetor2 {
	public static void main (String[]args) {
		Scanner ler = new Scanner(System.in);
		int i, a[], qt = 0, TAM = 10;
		a=new int [TAM];
		for(i=0;i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor:");
			a[i]=ler.nextInt();
			if (a[i] % 2 == 0) {
				qt = qt + 1;
			}
		}
		for(i=0; i<TAM; i++) {
			if (a[i] % 2 == 0) {
				System.out.print (a[i]+" ");
			}
		}
		System.out.println();
		System.out.println ("Temos "+qt+" elementos pares.");
		ler.close();
	}
}
