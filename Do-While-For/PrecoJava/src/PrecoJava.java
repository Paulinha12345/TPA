import java.util.Scanner;
public class PrecoJava {
	public static void main (String args[]) {
		Scanner ler=new Scanner(System.in);
		double custo, m, pV, p;
		String resposta="s";
		do {
			System.out.println ("Digite o custo do produto:");
			custo=ler.nextDouble();
			System.out.println ("Digite a margem de lucro do produto:");
			m=ler.nextDouble();
			p=(custo/100)*m;
			pV=custo+p;
			System.out.println ("O preço de venda é de R$ "+pV);
			System.out.println ("Deseja continuar? Digite S para sim ou N para não:");
			resposta=ler.next();
		}while (resposta.equalsIgnoreCase("s"));
		System.out.println("Fim do programa.");
		ler.close();
	}
}
