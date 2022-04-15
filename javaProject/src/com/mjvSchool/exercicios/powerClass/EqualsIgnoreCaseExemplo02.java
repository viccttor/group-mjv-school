package com.mjvSchool.exercicios.powerClass;

import java.util.Scanner;

public class EqualsIgnoreCaseExemplo02 {

	public static void main(String[] args) {
		/*
		 * equalsIgnoreCase - Serve para comparar um String ignorando se a s�o
		 * mai�sculas ou min�sculas retornando verdadeiro ou falso.
		 * 
		 */

		// Exemplo 02 - Dia da Semana
		Scanner sEntrada = new Scanner(System.in);
		
		// Informa��o
		System.out.println("Dia da Semana - Digite um n�mero entre 1 e 7 para que seja informado o dia da semana");
		System.out.println();
		
		// Estrutura
		
		System.out.print("Digite o dia da semana: ");
		String nomeDaSemana = sEntrada.next();
		
		if ("domingo".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " � o dia da semana de n�mero: "  + 1 );
		} else if ("segunda".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " � o dia da semana de n�mero: "  + 2 );
		} else if ("ter�a".equalsIgnoreCase(nomeDaSemana)
				|| "terca".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " � o " + 3 + " dia da semana!");
		} else if ("quarta".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " � o dia da semana de n�mero: "  + 4);
		} else if ("quinta".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " � o dia da semana de n�mero: " + 5 );
		} else if ("sexta".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " � o dia da semana de n�mero: "  + 6 );
		} else if ("s�bado".equalsIgnoreCase(nomeDaSemana)
				|| "sabado".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " � o dia da semana de n�mero: " + 7 );
		} else System.out.println("Dia inv�lido!");
	
		sEntrada.close();

	}

}
