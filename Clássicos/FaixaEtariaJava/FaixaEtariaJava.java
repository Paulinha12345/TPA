import java.util.*;
public class FaixaEtariaJava {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		int i,idade,qt1=0,qt2=0,qt3=0,qt4=0,qt5=0, qtTotal;
		double p1,p2, p3, p4, p5;
		for (i=1;i<=15;i++) {
			System.out.println("Digite a idade do "+i+"� pessoa:");
			idade=ler.nextInt();
			if(idade<=15) {
				qt1=qt1+1;
			}else if (idade<=30) {
				qt2=qt2+1;
			}else if(idade<=45) {
				qt3=qt3+1;
			}else if(idade<=60) {
				qt4=qt4+1;
			}else {
				qt5=qt5+1;
			}
		}
		qtTotal=qt1+qt2+qt3+qt4+qt5;
		p1=(qtdd1*100)/qtTotal;
		p2=(qtdd2*100)/qtTotal;
		p3=(qtdd3*100)/qtTotal;
		p4=(qtdd4*100)/qtTotal;
		p5=(qtdd5*100)/qtTotal;
		System.out.println("A quantidade de pessoas na faixa et�ria de at� 15 anos � "+qt1+" e sua porcentagem "+p1+"5");
		System.out.println("A quantidade de pessoas na faixa et�ria de 16 anos at� 30 anos � "+qt2+" e sua porcentagem "+p2+"5");
		System.out.println("A quantidade de pessoas na faixa et�ria de 31 anos at� 45 anos � "+qt3+" e sua porcentagem "+p3+"%");
		System.out.println("A quantidade de pessoas na faixa et�ria de 46 anos at� 60 anos � "+qt4+" e sua porcentagem "+p4+"%");
		System.out.println("A quantidade de pessoas na faixa et�ria acima de 61 anos � "+qt5+" e sua porcentagem "+p5+"%");
		ler.close();
	}
}