package exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaConvidados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList <String> convidados = new ArrayList<>(); 
		
		System.out.println("---- Escolha uma opção ----"
				+ "1 - Adicionar convidado"
				+ "2 - Alterar convidado"
				+ "3 - Remover convidado"
				+ "4 - Procurar convidado"
				+ "5 - Exibir convidados"
				+ "6 - Encerrar");
		do {
			System.out.println("Informe a opção desejada");
			int opcao = leia.nextInt();
			String nome;
			
			switch (opcao){
				case 1: 
					System.out.println("Informe o nome do convidado: ");
					convidados.add(nome);
					break;
				
				case 2:
					System.out.println("Informe a posição do convidado: ");
					int posicao = Integer.parseInt(leia.nextLine());
					
					if(convidados.isEmpty()) {
						String novoNome;
						convidados.add(novoNome);
					} else {
						System.out.print("Posição invalida!");
					}
					break;
					
				case 3:
					System.out.print("Nome que deseja procurar: ");
					String nomeProcurado = leia.nextLine();
					
					int
					
				
					
						} 
		    } while (convidados);
	}

}

