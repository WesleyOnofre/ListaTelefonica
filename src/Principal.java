import javax.swing.JOptionPane;

public class Principal {
	/**
	 * @author Wesley
	 *
	 */
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		int opçao;
		do {
			
		opçao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção\n"
				+ "1 - Insira contato\n"
				+ "2 - Buscar contato\n"
				+ "3 - Remover contato\n"
				+ "4 - Quantidade de contatos\n"
				+ "5 - Buscar telefone\n"
				+ "0 - Para sair"));
			if (opçao == 1) {
				contato.setNome(JOptionPane.showInputDialog("Informe o nome do usuario:"));
			}
			else if (opçao == 2) {
				contato.getNome();
			}
			else if(opçao == 3) {
				
			}
		}while(0 != opçao); {
			
		}

	}

}
