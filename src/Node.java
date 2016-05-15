
public class Node<T> {

	private T valor;
	private Node<T> esquerda;
	private Node<T> direita;

	public Node(T valor) {
		this.valor = valor;
	}

	public void insert(T valor) {
		if (esquerda == null)
			esquerda = new Node<>(valor);
		else if (direita == null)
			direita = new Node<>(valor);
		else
			esquerda.insert(valor);
	}
	
	public void print() {
		System.out.print("(" + valor + " ");
		if (esquerda != null)
			esquerda.print();
		else
			System.out.print("_");
		if (direita != null)
			direita.print();
		else
			System.out.print(" _");
		System.out.print(")");
	}
}
