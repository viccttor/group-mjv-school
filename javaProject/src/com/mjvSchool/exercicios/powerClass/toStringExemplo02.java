package com.mjvSchool.exercicios.powerClass;

import java.util.Scanner;

public class toStringExemplo02 {

	public static void main(String[] args) {

		// Exemplo 02 toString - Calculadora simples
		System.out.println("Exemplo 02 com toString: ");
		System.out.println();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Calculadora\n");
		System.out.print("Primeiro N�mero: ");
		String lerNum1 = entrada.next().replace(",", ".");
		System.out.print("Segundo N�mero: ");
		String lerNum2 = entrada.next().replace(",", ".");
		System.out.print("Tipo de opera��o ( - , + , * , / ou % ): ");
		String operacao = entrada.next();

		// Opera��es utilizando o operador tern�rio

		Double num1 = Double.parseDouble(lerNum1);
		Double num2 = Double.parseDouble(lerNum2);
		Double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;

		// Sa�da

		System.out.printf("\nResultado: %.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		System.out.println("\nNote que se voc� digitou um n�mero com a ',' o m�todo replace a trocou por '.' .");

		entrada.close();
	}

}
