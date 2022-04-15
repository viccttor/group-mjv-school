package com.mjvSchool.exercicios.powerClass;

import java.util.Scanner;

public class EqualsIgnoreCaseExemplo02 {

	public static void main(String[] args) {
		/*
		 * equalsIgnoreCase - Serve para comparar um String ignorando se a são
		 * maiúsculas ou minúsculas retornando verdadeiro ou falso.
		 * 
		 */

		// Exemplo 02 - Dia da Semana
		Scanner sEntrada = new Scanner(System.in);
		
		// Informação
		System.out.println("Dia da Semana - Digite um número entre 1 e 7 para que seja informado o dia da semana");
		System.out.println();
		
		// Estrutura
		
		System.out.print("Digite o dia da semana: ");
		String nomeDaSemana = sEntrada.next();
		
		if ("domingo".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " é o dia da semana de número: "  + 1 );
		} else if ("segunda".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " é o dia da semana de número: "  + 2 );
		} else if ("terça".equalsIgnoreCase(nomeDaSemana)
				|| "terca".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " é o " + 3 + " dia da semana!");
		} else if ("quarta".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " é o dia da semana de número: "  + 4);
		} else if ("quinta".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " é o dia da semana de número: " + 5 );
		} else if ("sexta".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " é o dia da semana de número: "  + 6 );
		} else if ("sábado".equalsIgnoreCase(nomeDaSemana)
				|| "sabado".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " é o dia da semana de número: " + 7 );
		} else System.out.println("Dia inválido!");
	
		sEntrada.close();

	}

}
