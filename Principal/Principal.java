package Principal;

import java.util.Scanner;

import Quartos.QuartosAlugados;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int qtde = sc.nextInt();
		
		QuartosAlugados[] vetor = new QuartosAlugados[qtde];
		
		for(int i =0; i< qtde; i++) {
			System.out.print("Digite o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Digite seu email: ");
			String email = sc.nextLine();
			
			System.out.println("Digite o numero do seu quarto: ");
			int numeroQuarto = sc.nextInt();
			
			vetor[i] = new QuartosAlugados(email, nome, numeroQuarto);
		}
		
		for (QuartosAlugados quartosAlugados : vetor) {
			System.out.println(quartosAlugados);
		}
		
		sc.close();

	}

}
