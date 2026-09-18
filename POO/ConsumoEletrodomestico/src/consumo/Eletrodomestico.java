package consumo;

public class Eletrodomestico {
	String nome;
	double potenciaWatts, horasPorDia;
	
	public Eletrodomestico() {
		nome = "";
	}

	public Eletrodomestico(String nome, double potenciaWatts, double horasPorDia) {
		this.nome = nome;
		this.potenciaWatts = potenciaWatts;
		if (horasPorDia >= 0 && horasPorDia <= 60)
		{
			this.horasPorDia = horasPorDia;
		}
	}
	
	public double consumoDiarioWh() {
		return potenciaWatts * horasPorDia; 
		
	}
	
	public double consumoMensalWh() {
		return consumoDiarioWh() * 30; 
		
	}
	
	public double consumoAnualWh() {
		return consumoMensalWh() * 12; 
		
	}
	
	public double gastoMensal(double precoKwh) {
		return consumoMensalWh() /1000; 
		
	}
	
	
	
	
	
	
}
