package App;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o valor da base do triângulo: ");
		int base = Integer.parseInt(leia.nextLine());
		
		System.out.println("Informe o valor da altura do triângulo: ");
		int altura = Integer.parseInt(leia.nextLine());
		
		do  {
			System.out.println("Erro!! Informe a medida novamente");
		}while (base <= 0 && altura <= 0);
		
		System.out.println("A área do triângulo é igual a : " + (base * altura)/2);
	

	}

}
