import java.util.Scanner;
public class Fatorial {
	public static void main (String[]args) {
		Scanner ler=new Scanner (System.in);
		int n, fat=1, i=1;
		System.out.println ("Digite o n�mero a ser fatorado:");
		n=ler.nextInt();
		while (i<=n){
			fat=i*fat;
			i++;
		}
		System.out.println ("O resultado da fatora��o � "+fat);
		ler.close();
	}
}
