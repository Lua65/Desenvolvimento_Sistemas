package estoque;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		HashMap<String, Integer> estoque = new HashMap<>();
		
		estoque.put("Teclado", 10);
		estoque.put("Mouse", 15);
		estoque.put("Monitor", 6);
		estoque.put("Notebook", 4);
		
		for(Map.Entry<String, Integer> esto : estoque.entrySet()) {
			System.out.println(
					"Produto: " + esto.getKey()
					+ " | Quantidade: " + esto.getValue());
			
		}
		
		System.out.print("\nInforme o nome do produto: ");
		String produto = leia.nextLine();
		
		if(estoque.containsKey(produto)) {
			Integer pro = estoque.get(produto);
			System.out.print("Quantidade em estoque: " + pro);
			
			System.out.print("\nDigite a nova quantidade: ");
			Integer novoEstoque = Integer.parseInt(leia.nextLine());
			
			estoque.put(produto, novoEstoque);
			
			System.out.println("Estoque alterado!");
			System.out.println("Novo estoque: " + estoque.get(produto));
			
			
			
			
		} else {
			System.out.println("Produto não encontrado!");
		}
		
		System.out.print("\nInforme o produto que deseja remover: ");
		produto = leia.nextLine();
		
		estoque.remove(produto);
		
		
		for(Map.Entry<String, Integer> esto : estoque.entrySet()) {
			System.out.println(
					"Produto: " + esto.getKey()
					+ " | Quantidade: " + esto.getValue());
			
		}
		
		leia.close();
	}

}
