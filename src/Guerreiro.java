
public class Guerreiro {
	
	/**
	 * Kaline Estevam
	 */
	
	private String nome;
	private InterfaceArma arma;
	private int energia;
	
	
	Guerreiro(String n){
		
		this.nome = n;
		this.energia = 100;
		
	}
	
	
	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public InterfaceArma getArma() {
		return arma;
	}


	public void setArma(InterfaceArma arma) {
		this.arma = arma;
	}
	
	

}
