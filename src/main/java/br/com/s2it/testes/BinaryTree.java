package br.com.s2it.testes;

public class BinaryTree {

	int somaValor;
	int valor;
	BinaryTree left;
	BinaryTree right;
	BinaryTree root;

	public BinaryTree() {
		this.somaValor = 0;
	}

	BinaryTree(int valor) {
		this.valor = valor;
		right = null;
		left = null;
	}

	private BinaryTree addBinaryTreeNode(BinaryTree current, int valor) {
		if (current == null) {
			return new BinaryTree(valor);
		}

		if (valor < current.valor) {
			current.left = addBinaryTreeNode(current.left, valor);
		} else if (valor > current.valor) {
			current.right = addBinaryTreeNode(current.right, valor);
		} else {
			// valor que ja existe
			return current;
		}

		return current;
	}

	public void addNode(int value) {
		root = addBinaryTreeNode(root, value);
	}

	public BinaryTree sumNodeValue(BinaryTree current, int value) {
		if (current == null) {
			return this;
		}

		if (value < current.valor) {
			this.somaValor += current.valor;
		}

		this.left = sumNodeValue(current.left, value);
		this.right = sumNodeValue(current.right, value);
		return this;
	}

}
