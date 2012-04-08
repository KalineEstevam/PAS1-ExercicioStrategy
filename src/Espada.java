
public class Espada implements InterfaceArma{
	
	private static final int DANOESPADA = 10;
	
	/**
	** Jéssyca Ferreira
	*/
	public void danoSofrido(Guerreiro guerreiro){
		
		if(guerreiro.getEnergia()>=10){
			
			int energiaFinal = guerreiro.getEnergia() - DANOESPADA;
			guerreiro.setEnergia(energiaFinal);
		
		}else {
		int energiaFinal = guerreiro.getEnergia() - DANOESPADA;
		guerreiro.setEnergia(energiaFinal);
		System.out.println("Morreu!");
		}
	}

}
