package convertendo;

public class App {

	public static void main(String[] args) {
		
		String numero1 = "10";
		Integer.parseInt(numero1);
		
		String numero2 = "5";
		Integer.parseInt(numero2);
		
		String preco = "12.50";
		Double.parseDouble(preco);
		double precoConvertido = Double.parseDouble(preco);
		
		System.out.println(numero1 + numero2);
		
		int n1 = Integer.parseInt(numero1);
		int n2 = Integer.parseInt(numero2);
		
		System.out.println("Soma: " + n1 + n2);
		System.out.println(n1 - n2);
		System.out.println("Multiplicação: " + n1 * n2);
		
		System.out.println("Preço original: " + preco);
		System.out.println("Preço após aumento: " + precoConvertido + 5);
		

	}

}
