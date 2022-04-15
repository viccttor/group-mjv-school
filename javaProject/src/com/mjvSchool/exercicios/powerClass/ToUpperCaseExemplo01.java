package com.mjvSchool.exercicios.powerClass;

import java.util.Scanner;

public class ToUpperCaseExemplo01 {

	public static void main(String[] args) {

		// toUpperCase

		// Exemplo 01
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um nome: ");
		String nome = entrada.nextLine().toUpperCase();
		System.out.println("\nUtilizando o toLowerCase, resultado: " + nome);

		entrada.close();

	}

}
