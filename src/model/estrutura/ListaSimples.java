package model.estrutura;

public class ListaSimples {
	private NoSimples<String> inicio = null;

	public void appendPessoa(String valor) {
		NoSimples<String> buffer = new NoSimples<>(valor);
		if (inicio == null || valor.compareTo(inicio.getValor()) < 0) {
			buffer.setProximo(inicio);
			inicio = buffer;
		} else {
			NoSimples<String> atual = inicio;
			while (atual.getProximo() != null && atual.getProximo().getValor().compareTo(valor) < 0) {
				atual = atual.getProximo();
			}
			buffer.setProximo(atual.getProximo());
			atual.setProximo(buffer);
		}
	}

	public void removerPessoa(String valor) {
		if (inicio == null) {
			return;
		}
		if (inicio.getValor().equals(valor)) {
			inicio = inicio.getProximo();
		} else {
			NoSimples<String> atual = inicio;
			while (atual.getProximo() != null) {
				if (atual.getProximo().getValor().equals(valor)) {
					atual.setProximo(atual.getProximo().getProximo());
					return;
				}
				atual = atual.getProximo();
			}
		}
	}

	public int localizarPessoa(String valor) {
		NoSimples<String> atual = inicio;
		int indice = 0;
		while (atual != null) {
			if (atual.getValor().equals(valor)) {
				return indice;
			}
			atual = atual.getProximo();
			indice++;
		}
		return -1;
	}

	public void imprimirLista() {
		NoSimples<String> atual = inicio;
		while (atual != null) {
			System.out.print(atual.getValor() + ", ");
			atual = atual.getProximo();
		}
		System.out.print("null");
	}
}
