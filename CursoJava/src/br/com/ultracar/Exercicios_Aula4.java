package br.com.ultracar;
import java.util.Scanner;

public class Exercicios_Aula4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MODULO 3
		
		Scanner s = new Scanner(System.in);

	/*	
		//EXERCICIO 1 

		int[] vetorAula2 = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		for(int numero:vetorAula2) {
			System.out.println(numero);
		}
	*/
		
		
		/*
		//EXERCICIO 2
		
		int[] vetorEx2 = new int[] {10,331,10,1,5,13,10};
		int soma = 0;
		double media;
		
		for(int numeroEx2:vetorEx2) {
			soma+=numeroEx2;
		}
		media =  soma / vetorEx2.length;
		System.out.println("MEDIA: " + media);
		
		*/
		//EXERCICIO 3
		/*
		long[] vetEx3 = new long[] {1,3,8,10,5,3,7,1,5,1};
		long x = vetEx3[0];
		for(int i = 1;i< vetEx3.length;i++) {
			x*=vetEx3[i];
		}
		System.out.println(x);
		*/
		
		/*
		//exercicio 4
		
		int[] vetEx4 = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] vetExResult = new int[10];
		int ponteiro = 10;
		
		for(int i = 0 ; i<=9;i++) {
			vetExResult[i] = vetEx4[--ponteiro]; 
			System.out.println(vetExResult[i]);
		}
		*/
		
		//exerercicio 7
		int[] vetEx7 = new int[10];
		int[] vetAux = new int[10];
		
		int ponteiro = 9, maior = -2147483648,indice = -1; ///inicializo as variaveis que vou precisar
		
		
		for(int i = 0; i <=9; i++) { //preencho o vetor
			System.out.println(i + ":     Informe um numero inteiro");
			vetEx7[i] = s.nextInt(); 
			
		}
		
		for(;ponteiro>=0;ponteiro--) {
			for(int x = 0; x <= 9; x++) {//descubro o maior e o indice do maior 
				
				if( vetEx7[x] > maior) {
					maior = vetEx7[x];
					indice = x;
				}
			}
			
			vetEx7[indice] = -2147483648;// defino a posicao que era maior para 0
			vetAux[ponteiro] = maior;
			maior = -2147483648;
		}	
		
		System.out.println("DAQUI PRA BAIXO JÁ ESTA ORDENADO");
		for(int y = 0; y <= 9 ; y++) {
			System.out.println(vetAux[y]);
		}
		
		
	}

}
