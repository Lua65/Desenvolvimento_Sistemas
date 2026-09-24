package mercado;

public class Principal {

	public static void main(String[] args) {
		Lampada lam1 = new Lampada();
		lam1.setNome("Florescente");
		lam1.setMarca("Philips");
		lam1.setPreco(20.50);
		lam1.setLigada(true);
		
		lam1.exibirLampada();
		lam1.mostrarEstado();
		
		Lampada lam2 = new Lampada();
		lam2.setNome("Florescente");
		lam2.setMarca("Avant");
		lam2.setPreco(19.00);
		lam2.setLigada(false);
		
		lam2.exibirLampada();
		lam2.mostrarEstado();

	}

}
