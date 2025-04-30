package projeto_LPA.aula13;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int vetor_a[] = new int[5];
		int vetor_b[] = new int[5];
		int vetor_c[] = new int[10];

		for (int i = 0; i < 5; i++) {
			System.out.print("informe o " + (1 + i) + "º valor de A: ");
			vetor_a[i] = ler.nextInt();
			System.out.print("informe o " + (1 + i) + "º valor de B ");
			vetor_b[i] = ler.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			vetor_c[i] = vetor_a[i];
			System.out.println(vetor_c[i]);
			vetor_c[i] = vetor_b[i];
			System.out.println(vetor_c[i]);
		}
		ler.close();
	}
}