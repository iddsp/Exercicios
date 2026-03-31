package Parte2;

import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

*/
public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um numero Inteiro:");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("Numero é NEGATIVO!");
		} else {
			System.out.println("Numero não é NEGATIVO");
		}
		
		sc.close();

	}

}
