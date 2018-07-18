package br.com.s2it.testes;

public class Teste {

	public static void main(String[] args) {
		try {
			System.out.println(createCNumber(10256, 512));
			sumBinaryTreeValuesNodes();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * Metodo responsavel pelo exercicio 8
	 */
	public static Integer createCNumber(Integer numberA, Integer numberB) throws Exception {

		String numberC = "";

		if (numberA == null || numberB == null) {
			throw new Exception("Impossivel realizar a formacao do numero C");
		}
		String numberAAux = numberA.toString();
		char[] numberACharacters = numberAAux.toCharArray();
		String numberBAux = numberB.toString();
		char[] numberBCharacters = numberBAux.toCharArray();

		int indexNumberExceed = 0;

		for (int i = 0; i < numberACharacters.length; i++) {
			if (i < numberBCharacters.length) {
				numberC = numberC.concat(String.valueOf(numberACharacters[i]) + numberBCharacters[i]);
				indexNumberExceed++;
			}
		}

		if (numberACharacters.length <= numberBCharacters.length) {
			for (int i = indexNumberExceed; i < numberBCharacters.length; i++) {
				numberC = numberC.concat(String.valueOf(numberBCharacters[i]));
			}
		} else {
			for (int i = indexNumberExceed; i < numberACharacters.length; i++) {
				numberC = numberC.concat(String.valueOf(numberACharacters[i]));
			}
		}

		System.out.println("Numero contatenado: " + numberC);
		Integer numberCValue = Integer.valueOf(numberC);
		return (numberCValue > 1000000) ? -1 : numberCValue;

	}

	/*
	 * Metodo responsavel pelo exercicio 9
	 */
	public static BinaryTree sumBinaryTreeValuesNodes() {
		BinaryTree bt = new BinaryTree();

		bt.addNode(6);
		bt.addNode(4);
		bt.addNode(8);
		bt.addNode(3);
		bt.addNode(5);
		bt.addNode(7);
		bt.addNode(9);

		bt = bt.sumNodeValue(bt.root, 6);
		System.out.println(bt.somaValor);
		return bt;
	}

}
