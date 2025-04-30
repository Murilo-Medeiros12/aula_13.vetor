package projeto_LPA.aula13;

import java.util.Scanner;

public class Vetor_Exercicio {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int a[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o valor " + i + "º:");
			a[i] = ler.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("O valor " +i+"º é: " + a[i]);
		}
		ler.close();
	}

}
