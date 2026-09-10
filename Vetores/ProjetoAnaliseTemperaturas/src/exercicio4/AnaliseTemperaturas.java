package exercicio4;

import java.util.Scanner;

public class AnaliseTemperaturas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double temperaturas[] = new double[7];
		double maior, menor;
		
		for(int i = 0 ; i < temperaturas.length; i++) {
			System.out.printf("Informe a %dª temperatura da semana: ", (i+1));
			temperaturas[i] =  Double.parseDouble(leia.nextLine());
		
		}
		
		maior = temperaturas[0];
		menor = temperaturas[0];
		
		for(double temperatura : temperaturas) {
			System.out.println(temperatura);
			
			if(temperatura > maior) {
				maior = temperatura;
			}  
			
			if (temperatura < menor){
				menor = temperatura;
			}
			
			
		}

		System.out.println("Maior temperatura: " + maior) ;
		System.out.println("Menor temperatura: " + menor) ;
	}

}
