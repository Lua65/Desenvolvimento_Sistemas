package contas;

public class ContaEspecial extends ContaBancaria{
	private double SaldoLimite = 500;

	public ContaEspecial(String numeroConta, String nomeCliente, double saldo, double saldoLimite) {
		super(numeroConta, nomeCliente, saldo);
		SaldoLimite = saldoLimite;
		
	}

	public ContaEspecial(String numeroConta, String nomeCliente, double saldo) {
		super(numeroConta, nomeCliente, saldo);
		
	}

	public double getSaldoLimite() {
		return SaldoLimite;
	}

	public void setSaldoLimite(double saldoLimite) {
		SaldoLimite = saldoLimite;
	}
	
	@Override
	public void sacar(double valor) {
		if(valor > 0) {
			if(valor <= getSaldo()) {
				setSaldo(getSaldo() - valor); 
				System.out.printf("Saque concluído com sucesso! saldo após o saque: R$ %.2f%n", getSaldo());
				
			} else {
				System.out.println("Saldo insuficiente!");
			}
			
		} else {
			System.out.println("Não tem como sacar valores negativos!");
		}
	
	}
	
	
	
	
	

}
