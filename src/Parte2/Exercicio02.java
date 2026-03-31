package Parte2;

import java.util.Scanner;

/*
 Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um numero Inteiro:");
		numero = sc.nextInt();
		
		if (numero % 2 == 0 ) {
			System.out.println("Numero é PAR!");
		} else {
			System.out.println("Numero é IMPAR");
		}
		
		sc.close();
		
	}

}
