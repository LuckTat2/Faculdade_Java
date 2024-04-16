package Model;

import java.util.Date;

public class Usuario {

	private int id;
	private String nome;
	private String senha;
	private String nivelAcesso;
	private char sexo;
	private Date dataNascimento;
	private String telefone;
	private String email;
	private String rg;
	private String endereco;
	
	public Usuario(int id, String nome, String senha, String nivelAcesso, char sexo, Date dataNascimento, String telefone, String email, String rg,
			String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
		this.nivelAcesso = nivelAcesso;
		this.sexo = sexo;
		this.telefone = telefone;
		this.email = email;
		this.rg = rg;
		this.endereco = endereco;
	}
	
	public Usuario(int id, String nome, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.senha = senha;
	}
	
	
	
}



