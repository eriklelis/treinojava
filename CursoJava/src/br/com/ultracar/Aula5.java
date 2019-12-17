package br.com.ultracar;
import java.util.Scanner;

public class Aula5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro siena = new Carro();
		Scanner s = new Scanner(System.in);
		siena.setRodas(4);
		
		Carro variant = new Carro(3);
		
		System.out.println(siena.getRodas());
		System.out.println(variant.getRodas());
	}

}
