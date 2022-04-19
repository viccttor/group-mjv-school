package com.mjvSchool.exercicios.powerClass.stringFormat;

public class StringFormatExemplo02 {

	public static void main(String[] args) {
		var nome = "Victor";
		var sobrenome = "Henrique";
		var idade = 23;
		var salario = 2.541;
		System.out.println("Nome: " + nome + "\tSobrenome: " + sobrenome + "\tIdade: " + idade + "\tSalário: " + salario);
		// a sentença de código ficou muito extensa
		
		System.out.printf("\n\nNome %s %s, tem %d anos e ganha R$%f por mês.", nome,sobrenome,idade,salario);
		System.out.printf("\n\nOutra Forma: Nome %s %s, tem %d anos e ganha R$%.2f. por mês.", nome,sobrenome,idade,salario);

	}

}
