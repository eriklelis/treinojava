package br.com.ultracar;

public class Aula4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] faltas = new boolean[7];
		faltas[0] = true;
		faltas[1] = true;
		faltas[2] = false;
		faltas[3] = true;
		faltas[4] = true;
		faltas[5] = true;
		faltas[6] = true;
		
		boolean faltou = true;
		for(boolean falta:faltas) {
			faltou = faltou && falta;
		}
		System.out.println(faltou);
		
		String[] nomes = new String[] {"José","João"};
		int[][] cordenadas = new int[10][10];
		cordenadas[0][0] = 1;
		cordenadas[0][1] = 2;
		
		int [][] coordenadas2 = new int[][]{{1,2},{3,4}};
		
		System.out.println(coordenadas2[0][0]);
		System.out.println(coordenadas2[0][1]);
		System.out.println(coordenadas2[1][0]);
		System.out.println(coordenadas2[1][1]);
		
		int[] notas = new int[] {3,7,8,9,5};
		
		
		
	}

}
