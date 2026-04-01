package Parte2;

import java.util.Locale;
import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
*/
public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo;
		int quantidade;
		double total;
		
		
		System.out.println("Digite o codigo:");
		codigo = sc.nextInt();
		
		System.out.println("Digite a quantidade:");
		quantidade = sc.nextInt();	
		
		
		if (codigo == 1) {
			total = quantidade*4;
			System.out.printf("O Total:R$ %.2f%n ", total);
		}else if (codigo == 2) {
			total = quantidade*4.50;
			System.out.printf("O Total:R$ %.2f%n ", total);
		}else if (codigo == 3) {
			total = quantidade*5;
			System.out.printf("O Total:R$ %.2f%n ", total);
		}else if (codigo == 4) {
			total = quantidade*2;
			System.out.printf("O Total:R$ %.2f%n ", total);
		}else if (codigo == 5) {
			total = quantidade*1.50;
			System.out.printf("O Total:R$ %.2f%n ", total);
		} else {
			System.out.printf("Código não Existente");
		}
		sc.close();
	}

}
