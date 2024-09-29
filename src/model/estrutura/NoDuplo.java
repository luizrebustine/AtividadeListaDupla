package model.estrutura;

public class NoDuplo<T>{
	
	private char letra;
	private ListaSimples listaNomes;
	private NoDuplo<T> proximo;
	private NoDuplo<T> anterior;
	
	public NoDuplo(char letra) {
		this.letra = letra;
		this.listaNomes = new ListaSimples();
		this.proximo = null;
		this.anterior = null;
	}
	
	public char getLetra() {
		return letra;
	}
	
	public ListaSimples getListaNomes() {
		return listaNomes;
	}
	
	public NoDuplo<T> getProximo() {
		return proximo;
	}
	public void setProximo(NoDuplo<T> proximo) {
		this.proximo = proximo;
	}
	
	public NoDuplo<T> getAnterior() {
		return anterior;
	}
	public void setAnterior(NoDuplo<T> anterior) {
		this.anterior = anterior;
	} 
}
