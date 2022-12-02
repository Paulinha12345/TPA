import java.util.Scanner;
public class MencaoJava {
	public static void main (String args[]) {
		Scanner ler=new Scanner(System.in);
		int qtAluno, qtMb, qtB, qtR, qtI, mencao;
		double pMb, pB, pR, pI;
		System.out.println ("Digite a quantidade total de alunos da sala:");
		qtddAluno=ler.nextInt();
		System.out.println ("Digite a quantidade de alunos com menção MB:");
		qtddMb=ler.nextInt ();
		System.out.println ("Digite a quantidade de alunos com meção B:");
		qtddB=ler.nextInt ();
		System.out.println ("Digite a quantidade de alunos com menção R:");
		qtddR=ler.nextInt ();
		System.out.println ("Digite a quantidade de alunos com menção I:");
		qtddI=ler.nextInt ();
		porcemMb=(qtMb*100)/qtAluno;
		porcemB=(qtB*100)/qtAluno;
		porcemR=(qtR*100)/qtAluno;
		porcemI=(qtI*100)/qtAluno;
		System.out.println ("Digite 1 para ver a estatísticas dos alunos MB, 2 para B, 3 para R ou 4 para I:");
		mencao=ler.nextInt ();
		switch (mencao) {
			case 1:
				System.out.println (pMb+"% de alunos com menção MB.");
				break;
			case 2:
				System.out.println (pB+"% de alunos com menção B.");
				break;
			case 3:
				System.out.println (pR+"% de alunos com menção R.");
				break;
			case 4:
				System.out.println (pI+"% de alunos com menção I.");
				break;
			default:
				System.out.println ("Menção inválida.");
		}
		ler.close ();
	}
}
