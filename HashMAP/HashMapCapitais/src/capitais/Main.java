package capitais;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		HashMap<String, String> capitais = new HashMap<>();
		
		capitais.put("Rio de Janeiro", "Rio de Janeiro");
		capitais.put("São Paulo", "São Paulo");
		capitais.put("Minas Gerais", "Belo Horizonte");
		capitais.put("Bahia", "Salvador");
		capitais.put("Paraná", "Curitiba");
		 
		for(Map.Entry<String, String> capital : capitais.entrySet()) {
			System.out.println(
					"Estado: " + capital.getKey()
					+ " | Capital: " + capital.getValue());
			
		}
		
		System.out.print("\nInforme o estado: ");
		String estado = leia.nextLine();
		
		if(capitais.containsKey(estado)) {
			String capital = capitais.get(estado);
			System.out.println("Capital encontrada: " + capital);
		} else {
			System.out.println("Estado não encontrado!");
		}
		
		leia.close();
	}

}