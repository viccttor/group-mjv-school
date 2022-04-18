package com.mjvSchool.exercicios.powerClass.decimalFormat;

import java.text.DecimalFormat; // Importando a classe DecimalFormat
import java.text.DecimalFormatSymbols; // Importando a classe Symbols do DecimalFormat
import java.util.Locale; //Importante a classe Locale

public class DecimalFormatExemplo01 {

	public static void main(String[] args) {

		String padrao = "###,###.##";
		DecimalFormat df = new DecimalFormat(padrao);
		System.out.println(df.format(124125434123123.123));
		
		// Aplicando o padrão Brasileiro
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2,dfs);
		System.out.println(df.format(124125434123123.123));
		
		
	}

}
