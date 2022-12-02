import java.util.Scanner;
public class JavaCategoria {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i;
		System.out.println("Digite sua idade:") ;
		i = in.nextInt();
		switch(i) {
		case 6: 
			System.out.println("Categoria dente de leite");
			break;
		case 7: 
			System.out.println("Categoria Júnior");
			break;
		case 8:
			System.out.println("Categoria júnior max");
			break;
		case 9:
			System.out.println("Categoria Júnior master");
			break;
		case 10:
			System.out.println("Master");
			default:
				System.out.println("idade inválida");
				
			}
		
		 }
	}

