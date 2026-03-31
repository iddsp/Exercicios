package Parte2;

import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */
public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Digite o primeiro valor:");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo valor:");
		b = sc.nextInt();
		
		if( a > b) { 
			if (a % b == 0 ) {
				System.out.println("Sao Multiplos!");
			} else {
				System.out.println("Nao sao Multiplos!");
			}
		}else {
			if (b % a == 0 ) {
				System.out.println("Sao Multiplos!");
			} else {
				System.out.println("Nao sao Multiplos!");
			}
		}
		sc.close();
	}
}
