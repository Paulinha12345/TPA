import java.util.Scanner;
public class inssJava {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		int i;
		double salario, d;
		for (i=1;i<=4;i++) {
			System.out.println ("Digite o salário do "+i+"° funcionário:");
			salario=ler.nextDouble();
			if (salario <2000.00) {
				d=salario-(salario*8.5)/100;
				System.out.println ("O desconto do INSS é R$ "+d);
			}else {
				d=salario-(salario*11)/100;
				System.out.println ("O desconto do INSS é de R$ "+d);
			}
		}
		ler.close();
	}
}
