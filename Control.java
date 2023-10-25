package javaAgenda;
import java.util.ArrayList;

public class Control {
	
	private ArrayList<Contato> contato = new ArrayList<Contato>();
	
	public boolean cadastrarContato(Contato contato) {
		
		//VERIFICA SE TEM ALGUM VALOR NO ARRAY LIST
		
		boolean alunoExistente = verificaContato(contato);

		if (alunoExistente) {
			return false;  // NÃO DEU PARA CADASTRAR
		}
		else {			
			this.contato.add(contato); //CADASTRA O ALUNO, ADICIONANDO O OBJETO NO ARRAY LIST
			return true;
		}
	}	
	
	public boolean verificaContato(Contato contato) {
		
		for (Contato alu: this.contato) {
			if (alu.equals(contato)) {
				return true;
			}
		}
		return false;
	}
}
