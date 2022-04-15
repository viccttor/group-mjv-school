package com.mjvSchool.exercicios.powerClass;

import java.util.Scanner;

public class EqualsIgnoreCaseExemplo01 {

	public static void main(String[] args) {
		/*
		 * equalsIgnoreCase - Serve para comparar um String ignorando se a são
		 * maiúsculas ou minúsculas retornando verdadeiro ou falso.
		 * 
		 */

		// Exemplo 01 - Comparação de duas palavras
		Scanner entrada = new Scanner(System.in);
		System.out.println("Comparação de  duas palavras");
		System.out.println();
		
		// Recebendo as duas palavras
		System.out.print("Digite a primeira palavra: ");
		String palavra01 = entrada.nextLine();
		System.out.print("Digite a segunda palavra: ");
		String palavra02 = entrada.nextLine();
		System.out.println();
		
		// Fazendo a comparação
		System.out.println("A palavra '" + palavra01 + "' é igual a palavra '" + palavra02 + "' ?");
		System.out.println("Resultado: " + palavra01.equalsIgnoreCase(palavra02) + ".");
		
		entrada.close();
		
	}

}
