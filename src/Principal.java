import javax.swing.JOptionPane;

public class Principal {
	/**
	 * @author Wesley
	 *
	 */
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		int op�ao;
		do {
			
		op�ao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o\n"
				+ "1 - Insira contato\n"
				+ "2 - Buscar contato\n"
				+ "3 - Remover contato\n"
				+ "4 - Quantidade de contatos\n"
				+ "5 - Buscar telefone\n"
				+ "0 - Para sair"));
			if (op�ao == 1) {
				contato.setNome(JOptionPane.showInputDialog("Informe o nome do usuario:"));
			}
			else if (op�ao == 2) {
				contato.getNome();
			}
			else if(op�ao == 3) {
				
			}
		}while(0 != op�ao); {
			
		}

	}

}
