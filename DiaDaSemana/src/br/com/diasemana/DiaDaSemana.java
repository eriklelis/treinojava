package br.com.diasemana;
import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String diaDaSemana = "";
		int numero = 0;
		boolean valida =true;
		
		System.out.println("Digite um numero(1 a 7): ");
		numero = s.nextInt();
		
		
		if(numero == 1){
			diaDaSemana = "Domingo";
		}else if(numero == 2) {
			diaDaSemana  = "Segunda-Feira";
		}else if(numero == 3) {
			diaDaSemana  = "Terca-Feira";
		}else if(numero == 4) {
			diaDaSemana  = "Quarta-Feira";
		}else if(numero == 5) {
			diaDaSemana  = "Quinta-Feira";
		}else if(numero == 6) {
			diaDaSemana  = "Sexta-Feira";
		}else if(numero == 7) {
			diaDaSemana  = "Sabado";
		}else {
			System.out.println("Você informou o numero incorretamente.");
			valida = false;
		}
		
		if (valida) {
			System.out.println("O dia da semana referente ao numero informado é: " + diaDaSemana);
		}
	}

}
