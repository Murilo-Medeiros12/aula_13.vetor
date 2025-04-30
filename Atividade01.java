package projeto_LPA.aula13;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nome[] = new String[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("informe o " + (i + 1) + "º nome: ");
			nome[i] = ler.next();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println("o " + (i + 1) + "º nome é: " + nome[i]);
		}
		ler.close();
	}

}
