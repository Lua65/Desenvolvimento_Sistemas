package operacao;


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Math.sqrt(2);
		int numero;
		
		do {
			System.out.println("Informe um número: ");
			numero =  leia.nextInt();
			
			System.out.println("Valor digitado: " + (numero));
			System.out.println("Quadrado do número: " + (numero * numero ));
			System.out.println("O cubo do número: " + (numero * numero * numero));
			System.out.println("A raiz quadrada do número: " + Math.sqrt(numero));
			
			
			
		} while (numero > 0);

	}

}
