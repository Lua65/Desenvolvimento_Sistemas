package categoria;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = Integer.parseInt(leia.nextLine());
		
		if (idade < 5) {
			System.out.println("Nenhuma categoria");
		} else if (idade >= 5 && idade <=7) {
			System.out.println("infantil");
		} else if(idade >= 8 && idade <=10) {
			System.out.println("juvenil");
		} else if (idade >= 11 && idade <= 15) {
			System.out.println("adolescente");
		} else if (idade >= 16 && idade <= 30) {
			System.out.println("adulto");
		} else {
			System.out.println("sênior");
		}
			

	}

}
