package com.mjvSchool.exercicios.powerClass;

public class toStringExemplo01 {

	public static void main(String[] args) {

		// toString();

		// Exemplo 01
		System.out.println("Exemplo 01 com toString: ");
		System.out.println();

		int num1 = 10;
		System.out.println("Note que ir� somar o n�mero 10 com o numero 1, trazendo o resultado 11: " + (num1 + 1));
		String num2 = Integer.toString(num1);
		System.out.println(
				"J� neste caso, como convertemos a vari�vel em String, ao inv�s de somar, ele colocar� uma ao lado da outra: "
						+ (num2 + 1));

	}

}
