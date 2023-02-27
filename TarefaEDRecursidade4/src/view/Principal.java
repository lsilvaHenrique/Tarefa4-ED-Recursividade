package view;

import controller.InverteStringController;

public class Principal {

	public static void main(String[] args) {
		InverteStringController inverter = new InverteStringController();
		
		String palavra = "teste";
		int tamanho = palavra.length();
		String palavraInvertido = inverter.inverterString(palavra, tamanho);
		
		System.out.println("Palavra = "+ palavra +"\nInvertida = "+ palavraInvertido);
	}

}