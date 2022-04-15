package com.mjvSchool.exercicios.powerClass;

import java.util.Scanner;

public class ToLowerCaseExemplo01 {

	public static void main(String[] args) {
		// toUpperCase

		// Exemplo 01
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um nome: ");
		String nome = entrada.nextLine().toLowerCase();
		System.out.println("\nUtilizando o toLowerCase, resultado: " + nome);

		entrada.close();
	}

}
