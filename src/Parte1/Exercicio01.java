package Parte1;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int soma;

		System.out.println("Digite o primeiro Valor:");
		x = sc.nextInt();

		System.out.println("Digite o segundo Valor:");
		y = sc.nextInt();

		soma = x + y;

		sc.close();
		System.out.println("Soma = " + soma);

	}

}
