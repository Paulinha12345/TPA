package numPrimoJava;

import java.util.Scanner;

public class numPrimoJava {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int resultado, n,i=1,qt=0;
		System.out.println("Digite o número para saber se ele é primo:");
		n=ler.nextInt();
		do {
			resultado=n%i;
			if(resultado==0) {
				qt=qt+1;
			}
			i++;
		}while(i<=n);
		if(qt==2) {
			System.out.println(n+" é primo");
		}else {
			System.out.println(n+" não é primo.");
		}
		ler.close();
		
			
		}

	}
