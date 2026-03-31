/*
 Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
 código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 
 */
package Parte1;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int codigoPeca1;
		int numeroPeca1;
		double valorPeca1;
		int codigoPeca2;
		int numeroPeca2;
		double valorPeca2;

		double valorTotal;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código da Peça 1:");
		codigoPeca1 = sc.nextInt();
		System.out.println("Digite o número de Peça 1:");
		numeroPeca1 = sc.nextInt();
		System.out.println("Digite o o valor unitário de Peça 1:");
		valorPeca1 = sc.nextDouble();

		System.out.println("Digite o código da Peça 2:");
		codigoPeca2 = sc.nextInt();
		System.out.println("Digite o número de Peça 2:");
		numeroPeca2 = sc.nextInt();
		System.out.println("Digite o o valor unitário de Peça 2:");
		valorPeca2 = sc.nextDouble();

		valorTotal = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);

		sc.close();
		System.out.printf("O Valor a Pagar = %.2f%n ", valorTotal);

	}

}
