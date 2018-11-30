import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Agenda {
	
	private ArrayList<Contato> contatos = new ArrayList<Contato>();

	public void inserirContato(Contato contato) {
		this.contatos.add(contato);
		JOptionPane.showMessageDialog(null, "Número adicionado com sucesso!");
	}
	
	public Contato buscarContato(String nome) {
		for (int i = 0; i < this.contatos.size(); i++) {
			String nomeAtual = contatos.get(i).getNome();
			if(nome.equals(nomeAtual)) {
				return contatos.get(i);
			}
			
		}
		return null;
	}
	
	public boolean removerContato(String nome) {
		for (int i = 0; i < this.contatos.size(); i++) {
			String nomeAtual = contatos.get(i).getNome();
			if(nome.equals(nomeAtual)) {
				this.contatos.remove(i);
				return true;
			}
			
		}
		return false;
	}
	
	public int quantidadeContatos () {
		return this.contatos.size();
	}
	
	public Contato buscarTelefone(String telefone) {
		for (int i = 0; i < this.contatos.size(); i++) {
			String telefoneAtual = contatos.get(i).getTelefone();
			if(telefone.equals(telefoneAtual)) {
				return this.contatos.get(i);
			}
		}
		return null;
	}
	
	
}
