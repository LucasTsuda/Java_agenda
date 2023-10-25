package javaAgenda;
import java.io.Serializable;

public class Contato implements Serializable  {
	private static final long serialVersionUID = 1L;
	private String nome;
	private int idade;
	private String endereco;
	private String telefone;
	private String email;
	
	// METODO CONTRUTOR DAS VARIAVEIS DA CLASSE CONTATO
	
	public Contato(String nome, int idade, String endereco, String telefone, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
	
	// GET E SET DA CLASSE CONTATO

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
