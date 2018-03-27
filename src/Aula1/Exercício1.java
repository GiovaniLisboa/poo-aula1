package Aula1;

import java.util.Scanner;

public class Exercício1 {
	public static void main(String[] args) {
		System.out.print("Escreve alguma coisa idiota: ");
		Scanner scanner = new Scanner(System.in);
		String entrada = scanner.nextLine();
		System.out.println(entrada);
	}
}