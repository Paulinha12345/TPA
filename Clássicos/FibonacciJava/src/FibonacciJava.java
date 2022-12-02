import java.util.Scanner;
public class FibonacciJava {
	public static void main (String[]args) {
		Scanner ler=new Scanner (System.in);
		int n, t1=0, t2=1, i=1, proxT=1;
		System.out.println ("Digite quantos termos você quer ver:");
		n=ler.nextInt();
		do {
			System.out.println (proxT);
			proxT=t1+t2;
			t1=t2;
			t2=proxT;
			i++;
		}while (i<=n);
		ler.close();
	}
}
