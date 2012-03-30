import javax.swing.JOptionPane;


public class Main {

	/**
	 * Kaline Estevam
	 */
	public static void main(String[] args) {
		
		String nomeDoGuerreiro1 = JOptionPane.showInputDialog(null, "Digite o nome do guerreiro 1.");
		String nomeDoGuerreiro2 = JOptionPane.showInputDialog(null, "Digite o nome do guerreiro 2.");
		Guerreiro g1 = new Guerreiro(nomeDoGuerreiro1);
		Guerreiro g2 = new Guerreiro(nomeDoGuerreiro2);
		JOptionPane.showMessageDialog(null, "Os guerreiros tem energia 100");
		int opcao1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma arma para "+g1.getNome()+"\n1. Faca"+"\n2.Espada"+"\n3.Lança"+"\n0.Sair"));
		
		/**
		** Jéssyca Ferreira
		*/
		switch(opcao1){
		
		case 1:
			
			InterfaceArma faca = new Faca();
			g1.setArma(faca);
			JOptionPane.showMessageDialog(null, "O guerreiro "+g1.getNome()+" esta com a arma "+g1.getArma());
			break;
		
		case 2:
			
			InterfaceArma espada = new Espada();
			g1.setArma(espada);
			JOptionPane.showMessageDialog(null, "O guerreiro "+g1.getNome()+" esta com a arma "+g1.getArma());
			break;
			
		case 3:
			
			InterfaceArma lanca = new Lanca();
			g1.setArma(lanca);
			JOptionPane.showMessageDialog(null, "O guerreiro "+g1.getNome()+" esta com a arma "+g1.getArma());
			break;
			
		case 0:
			break;
		}
		
		int opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma arma para "+g2.getNome()+"\n1. Faca"+"\n2.Espada"+"\n3.Lança"+"\n0.Sair"));
		
		switch(opcao2){
		
		case 1:
			
			InterfaceArma faca = new Faca();
			g1.setArma(faca);
			JOptionPane.showMessageDialog(null, "O guerreiro "+g2.getNome()+" esta com a arma "+g1.getArma());
			break;
		
		case 2:
			
			InterfaceArma espada = new Espada();
			g1.setArma(espada);
			JOptionPane.showMessageDialog(null, "O guerreiro "+g2.getNome()+" esta com a arma "+g1.getArma());
			break;
			
		case 3:
			
			InterfaceArma lanca = new Lanca();
			g1.setArma(lanca);
			JOptionPane.showMessageDialog(null, "O guerreiro "+g2.getNome()+" esta com a arma "+g1.getArma());
			break;
			
		case 0:
			break;
		}
		
		
		
		JOptionPane.showMessageDialog(null, "A luta começará por sorteio. Boa sorte!");	
		
		/**
		 * Kaline Estevam
		 */
		int numeroSorteado = (int)(Math.random() * 10);
		
		if(numeroSorteado % 2 == 0){
			
			JOptionPane.showMessageDialog(null, "Guerreiro "+g1.getNome()+" ataque!");
			InterfaceArma golpeG1 = g1.getArma();
			golpeG1.danoSofrido(g2);
			
		}else{
		JOptionPane.showMessageDialog(null, "Guerreiro "+g2.getNome()+" ataque!");
		InterfaceArma golpeG2 = g2.getArma();
		golpeG2.danoSofrido(g1);
		}
	}

}
