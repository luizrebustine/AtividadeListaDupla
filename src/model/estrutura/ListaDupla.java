package model.estrutura;

public class ListaDupla<T> {
	private NoDuplo<T> inicio = null;
	
	public void appendPessoa(String valor) {
		char letraInicial = valor.charAt(0);
		NoDuplo<T> atual = inicio;
		NoDuplo<T> anterior = null;
		while (atual != null && atual.getLetra() < letraInicial) {
            anterior = atual;
            atual = atual.getProximo();
        }
		if (atual != null && atual.getLetra() == letraInicial) {
            atual.getListaNomes().appendPessoa(valor);
            return;
        }
		NoDuplo<T> buffer = new NoDuplo<>(letraInicial);
		buffer.getListaNomes().appendPessoa(valor);
        if (anterior == null) {
        	buffer.setProximo(inicio);
            inicio = buffer;
        } else {
            anterior.setProximo(buffer);
            buffer.setProximo(atual);
        }
	}
	
	public void removerNome(String valor) {
        char letraInicial = valor.charAt(0);
        NoDuplo<T> atual = inicio;

        while (atual != null) {
            if (atual.getLetra() == letraInicial) {
                atual.getListaNomes().removerPessoa(valor);
                return;
            }
            atual = atual.getProximo();
        }
    }
	
	 public int localizarNome(String valor) {
        char letraInicial = valor.charAt(0);
        NoDuplo<T> atual = inicio;

        while (atual != null) {
            if (atual.getLetra() == letraInicial) {
                return atual.getListaNomes().localizarPessoa(valor);
            }
            atual = atual.getProximo();
        }
        return -1;
    }
	
	public void imprimirLista() {
		NoDuplo<T> atual = inicio;
		while (atual != null) {
			System.out.print(atual.getLetra() + " = {");
			atual.getListaNomes().imprimirLista();
			System.out.print("}\n");
			atual = atual.getProximo();
		}
	}
}
