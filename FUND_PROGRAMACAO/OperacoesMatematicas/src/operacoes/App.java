package operacoes;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int numero1 = leia.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int numero2 = leia.nextInt();
		
		
		
		
		System.out.println("---- Escolha uma opção ---- \n"
				+ "1 - Calcular a média dos números; \n"
				+ "2 - Subtrair o menor número do maior; \n"
				+ "3 - Multiplicar os números;\n"
				+ "4 - Dividir o primeiro número pelo segundo.");
		
		System.out.println("Informe a opção desejada: ");
		int opcao = leia.nextInt();
		
		
		switch (opcao) {
			case 1:
				System.out.println("A média dos valores informados é igual a: "+ (numero1 * numero2)/2);
				break;
				
			case 2:
				if (numero1 > numero2) {
					System.out.println("A subtração do maior número pelo menor número é igual a: " + (numero1 - numero2));
				} else{
					System.out.println("A subtração do maior número pelo menor número é igual a: " + (numero2 - numero1));
				}
				break;
				
			case 3:
				System.out.println("A múltiplicação dos valores informados é igual a: " + (numero1 * numero2));
				break;
				
			case 4:
				if (numero2 > 0) {
					System.out.println("A divisão dos valores informados é igual a: " + (numero1 / numero2));
					break;
				} else {
					System.out.println("Não é possivel dividir o número por 0 \n");
				}
			default:
				System.out.println("Opção inválida!");
		}
		

	}

}
