package desafioTarget2;

import java.util.Scanner;

public class LetraA {

	public static void main(java.lang.String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		System.out.println("Informe a String");
		input = scan.nextLine();

		char[] vetor = input.toCharArray();
		int cont = 0;

		for (char x : vetor) {
			if (x == 'a' || x == 'A') {
				cont++;
			}
		}

		if (cont > 0) {
			System.out.println("A letra 'a' apareceu " + cont + " vezes");
		} else {
			System.out.println("A letra 'a' não aparece");
		}

	}
}