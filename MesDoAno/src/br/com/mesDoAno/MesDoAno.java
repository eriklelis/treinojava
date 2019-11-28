package br.com.mesDoAno;

import java.util.Scanner;

public class MesDoAno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String mesDoAno = "";
		int numero = 0;
		boolean valida = true;

		System.out.println("Digite um numero(1 a 12): ");
		numero = s.nextInt();
		
		
		
		if (numero == 1) {
			mesDoAno = "Janeiro";
		} else if (numero == 2) {
			mesDoAno = "Fevereiro";
		} else if (numero == 3) {
			mesDoAno = "Marco";
		} else if (numero == 4) {
			mesDoAno = "Abril";
		} else if (numero == 5) {
			mesDoAno = "Maio";
		} else if (numero == 6) {
			mesDoAno = "Junho";
		} else if (numero == 7) {
			mesDoAno = "Julho";
		} else if (numero == 8) {
			mesDoAno = "Agosto";
		} else if (numero == 9) {
			mesDoAno = "Setembro";
		} else if (numero == 10) {
			mesDoAno = "Outubro";
		} else if (numero == 11) {
			mesDoAno = "Novembro";
		} else if (numero == 12) {
			mesDoAno = "Dezembro";
		} else {
			System.out.println("Você informou o numero incorretamente.");
			valida = false;
		}

		if (valida) {
			System.out.println("O mês do ano referente ao numero informado é: " + mesDoAno);
		}
	}

}
