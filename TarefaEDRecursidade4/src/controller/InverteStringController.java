package controller;

public class InverteStringController {

	public InverteStringController() {}
	
	public String inverterString(String palavra, int qtdeCaracteres) {
		qtdeCaracteres -= 1;
		// Condicao de parada ==> Chegar no indice do primeiro caractere da palavra
		if (qtdeCaracteres == 0) {
			return palavra.charAt(0) + "";
		} else {
			return palavra.charAt(qtdeCaracteres) + inverterString(palavra, qtdeCaracteres);
		}
		/*
		 	t
		 	e + (teste, 0)
		 	s + (teste, 1)
		 	t + (teste, 2)
			e + (teste, 3)
		*/
	}

}
