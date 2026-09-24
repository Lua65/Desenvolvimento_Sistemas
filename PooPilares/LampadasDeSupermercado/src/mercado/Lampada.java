package mercado;

public class Lampada {
	private String nome, marca;
	private double preco;
	private boolean ligada;
	
	
	public Lampada() {
		super();
	}

	public Lampada(String nome, String marca, double preco, boolean desligada, boolean ligada) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.ligada = ligada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void mostrarEstado() {
		if(ligada == true) {
			System.out.println("A lâmpada esta ligada!\n");
		} else {
			System.out.println("A lâmpada esta desligada! \n");
		}
	}
	
		
	public void exibirLampada() {
		System.out.printf("Nome: %s%nMarca: %s%nPreço: %.2f%n", nome, marca, preco);
	}
	
	

}
