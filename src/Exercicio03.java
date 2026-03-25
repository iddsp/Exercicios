import java.util.Scanner;

/*
	Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). 

*/

public class Exercicio03 {

	public static void main(String[] args) {
		int a ;
		int b ;
		int c ;
		int d ;
		double diferenca;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro Valor:");
		a = sc.nextInt();
		System.out.println("Digite o segundo Valor:");
		b = sc.nextInt();
		System.out.println("Digite o terceiro Valor:");
		c = sc.nextInt();
		System.out.println("Digite o quarto Valor:");
		d = sc.nextInt();
		
		diferenca = (a*b - c*d);
		
		sc.close();
		System.out.printf("A Diferença é = %.0f%n ", diferenca);
		
	}

}
