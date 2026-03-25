import java.util.Locale;
import java.util.Scanner;
/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.

*/
public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		int numeroFuncionario ;
		int numeroHora ;
		double valorHora ;
		double salario;
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite o número de um funcionário:");
		numeroFuncionario = sc.nextInt();
		System.out.println("Digite o seu número de horas trabalhadas:");
		numeroHora  = sc.nextInt();
		System.out.println("Digite o o valor que recebe por hora:");
		valorHora = sc.nextDouble();

		
		salario = numeroHora * valorHora;
		
		sc.close();
		System.out.printf("O funcionario de Numero:" + numeroFuncionario +"\nO salario é = %.2f%n ",salario);

	}

}
