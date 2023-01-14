import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int opcao=0;
		
		do {
			System.out.println("Escolhe uma opção:");
			System.out.println("1 - Iniciar jogo");
			System.out.println("2 - Ajuda");
			System.out.println("3 - Sair");
			System.out.println("OPÇÃO:");
			opcao = entrada.nextInt();
		}while(opcao !=3);
			
	}
}


