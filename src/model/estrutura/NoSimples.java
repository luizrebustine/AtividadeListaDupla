package model.estrutura;

@SuppressWarnings("hiding")
public class NoSimples<String> {
	private String valor;
	private NoSimples<String> proximo;
	
	public NoSimples(String valor) {
		this.proximo = null;
		this.valor = valor;
	}
	
	public NoSimples(String valor, NoSimples<String> proximo) {
		this.proximo = proximo;
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public NoSimples<String> getProximo() {
		return proximo;
	}
	public void setProximo(NoSimples<String> proximo) {
		this.proximo = proximo;
	}
}
