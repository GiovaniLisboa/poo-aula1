package Aula1;

import java.util.Scanner;

public class Exerc�cio2 {
	public static void main(String[] args) {
				
		for (int i = 0; i < 4; i++) {
			System.out.println("Quantos anos voc� tem?");
			Scanner scanner = new Scanner(System.in);
			int numero = scanner.nextInt();
			
			if (numero < 30){
				System.out.println("Novinho ainda.");
			} else {
				if (numero < 60) {
					System.out.println("Ainda vai viver um tempo");
					} else {
						System.out.println("J� t� pra morrer!!!");
						}
				}
		}
	}
}