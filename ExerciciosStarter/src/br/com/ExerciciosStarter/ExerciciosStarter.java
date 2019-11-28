package br.com.ExerciciosStarter;
import java.util.Scanner;

public class ExerciciosStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*//EXERCICIO 1
		int a = 0, b = 0,  c = 0, d= 0 ;
		a = 3 - 2 - 1 + 2 + 1 + 3;
		b = 2 * 3 - 4 * 5;
		c = 2 + 6 - 3 / 7 * 9;
		d = 3 % 4 - 8;
		 	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		*/
		//EXERCICIO 2
		/*
		int i_32Bits = 1;
		long j_64Bits=2;
		
		float p_32Bits = 20;
		double q_64Bits = 30;
		
		boolean b = true;
		char c = 'k';
		
		System.out.println(i_32Bits);
		System.out.println(j_64Bits);
		System.out.println(p_32Bits);
		System.out.println(q_64Bits);
		System.out.println(b);
		System.out.println(c);	
		*/
		
		//EXERCICIO 3
		/*
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
		*/
		//Exercicio 4
		/*
		String diaDaSemana = "";
		int numero;
		boolean valida =true;
		
		for(;;) {
				
		
			System.out.println("Digite um numero(1 a 7) || 0 para finalizar: ");
			numero = s.nextInt();
			 if(numero == 0 ) {
				 break;
			 }
			
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
		System.out.print("FIM!");
		*/
		//Exercicio 5
		/*
		String mesDoAno = "";
		int numero = 0;
		boolean valida =true;
		for(;;) {
			System.out.println("Digite um numero(1 a 12) || 0 para finalizar: ");
			numero = s.nextInt();
			if(numero ==0) {
				break;
			}
			
			if(numero == 1){
				mesDoAno = "Janeiro";
			}else if(numero == 2) {
				mesDoAno  = "Fevereiro";
			}else if(numero == 3) {
				mesDoAno  = "Marco";
			}else if(numero == 4) {
				mesDoAno  = "Abril";
			}else if(numero == 5) {
				mesDoAno  = "Maio";
			}else if(numero == 6) {
				mesDoAno  = "Junho";
			}else if(numero == 7) {
				mesDoAno  = "Julho";
			}else if(numero == 8) {
				mesDoAno  = "Agosto";
			}else if(numero == 9) {
				mesDoAno  = "Setembro";
			}else if(numero == 10) {
				mesDoAno  = "Outubro";
			}else if(numero == 11) {
				mesDoAno  = "Novembro";
			}else if(numero == 12) {
				mesDoAno  = "Dezembro";
			}else{
				System.out.println("Você informou o numero incorretamente.");
				valida = false;
			}
			
			if (valida) {
				System.out.println("O mês do ano referente ao numero informado é: " + mesDoAno);
			}
			
		}
		System.out.println("Fim!");
	*/
		//exercicio 6
		/*
		int x = 10, y = 1;
		do {
			System.out.println("Valor de x: " + x + " | " + y);
			x++;
			y++;
		}while(y <= 20);
		System.out.println("Valor final de x: " + x);
		*/
		
		//exercicio7
		/*
		int  fimpares = 0, par = 0, impar = 1;
		long fpares = 1;
		
		for(int i = 1; i<=15;i++) {
			par+=2;
			System.out.println(par);
			impar+=2;
			
			if(par>= 30 || impar >= 30) {
				break;
			}else {
				fpares *=par;
				fimpares +=impar;
			}
			//System.out.println("par: " + par);
			//System.out.println("impar: " + impar);
			//System.out.println(i);
		}
		System.out.println("Valor final par: " + fpares);
		System.out.println("Valor final impar: " + fimpares);
		
		*/
		
		//exercicio 8
		for(int i= 0; i<10; i++){
			for(int j = 0; j <10; j++) {
				
			}
		}
		
		
	}
}
