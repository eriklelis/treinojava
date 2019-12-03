package br.com.ultracar;

public class Exercicios_Aula4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MODULO 3

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
		long[] vetEx3 = new long[] {1,3,8,10,5,3,7,1,5,1};
		long x = vetEx3[0];
		for(int i = 1;i< vetEx3.length;i++) {
			x*=vetEx3[i];
		}
		System.out.println(x);
		
		
		
		
	}

}
