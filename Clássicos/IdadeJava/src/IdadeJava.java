import java.util.Scanner;

public class IdadeJava {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		int idade, idadeMa=-1, idadeMe=1000, i=1 ;
		double media, somaI=0;
		do {
			System.out.println("Digite a idade do "+i+"° usuário:");
			idade=ler.nextInt();
			somaI=somaI+idade;
			if(idade>idadeMa) {
				idadeMa=idade;
			}else if(idade<idadeMe){
				idadeMe=idade;
			}
			i++;
		}while (i<=10);
		media=somaI/10;
		System.out.println ("A média de idades é "+media);
		System.out.println("A idade mais velha é "+idadeMa+" anos, e a idade mais novo é "+idadeMe+" anos");
		ler.close();
	}
}