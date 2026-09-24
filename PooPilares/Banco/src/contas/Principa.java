package contas;

public class Principa {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.setNumeroConta("0624951");
		conta1.setNomeCliente("Luiz augusto");
		conta1.setSaldo(200);
		conta1.exibirDados();
		conta1.depositar(20);
		conta1.sacar(10);
	
		ContaBancaria conta2 = new ContaBancaria();
		
		conta2.setNumeroConta("0554374");
		conta2.setNomeCliente("Marcos augusto");
		conta2.setSaldo(.10);
	
	
	}

}
