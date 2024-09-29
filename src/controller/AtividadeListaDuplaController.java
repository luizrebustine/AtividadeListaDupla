package controller;

import model.estrutura.ListaDupla;

public class AtividadeListaDuplaController {
	
	public void teste() {
		ListaDupla<String> lista = new ListaDupla<>();
		lista.appendPessoa("Luiz");
		lista.appendPessoa("Diego");
		lista.appendPessoa("Gustavo");
		lista.appendPessoa("Esc");
		lista.appendPessoa("Gabriel");
		lista.appendPessoa("Vitor Pietro");
		
		lista.removerNome("Vitor Pietro");
			
		lista.imprimirLista();
		System.out.println(lista.localizarNome("Gustavo"));
	}
}
