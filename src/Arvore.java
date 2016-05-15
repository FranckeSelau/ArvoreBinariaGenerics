
public class Arvore<T> {

	private Node<T> raiz;

	public void insert(T valor) {
		if (raiz == null)
			raiz = new Node<>(valor);
		else
			raiz.insert(valor);
	}

	public void print() {
		if (raiz != null)
			raiz.print();
	}
}
