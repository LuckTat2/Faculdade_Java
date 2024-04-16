package View;

import Model.Servico;
import Model.Usuario;
import Model.Cliente;

public class Main {

	public static void main(String[] args) {
		String nome = "Roberto";
		System.out.println(nome);
		//Teste de instanciação
		Servico servico = new Servico(1,"Barba",20);
		
		System.out.println(servico.getDescricao());
		System.out.println(servico.getValor());

		Cliente cliente = new Cliente(1,"Rogério",'M',"95445866","Rua Tesla 95");
		System.out.println(cliente.getNome());
		
		Usuario usuario = new Usuario(1,"Barbeiro","Senha");
		System.out.println(usuario);
	}

}
