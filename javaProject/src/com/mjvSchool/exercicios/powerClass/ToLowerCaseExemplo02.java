package com.mjvSchool.exercicios.powerClass;

import java.util.Scanner;

public class ToLowerCaseExemplo02 {

	public static void main(String[] args) {
		// toUpperCase

		// Exemplo 02
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um nome: ");
		String nome = entrada.nextLine().toLowerCase().replace(" ", ""); // utilizado o replace para remover todos os espaços em branco
		System.out.println("\nUtilizando o toLowerCase, resultado: " + nome);

		entrada.close();

	}

}
