import java.util.Scanner;
public class Vetor1 {
	public static void main (String[]args) {
		Scanner ler = new Scanner(System.in);
		int i, a[], TAM=10, meVa=10000, maVa=-1;
		a=new int [TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor:");
			a[i]=ler.nextInt();
			if (a[i]>maVa) {
				maVa=a[i];
			}else if (a[i]<meVa) {
				meVa=a[i];
			}
		}
		System.out.println("O maior valor é: "+maVa+" e o menor valor é: "+meVa);
		ler.close();
	}
}
