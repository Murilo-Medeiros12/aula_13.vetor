package projeto_LPA.aula13;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int total = 0;
		int num[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("informe o " + (i + 1) + "º numero: ");
			num[i] = ler.nextInt();
			total = num[i] + total;
		}
		if (total > 15) {
			System.out.println(total + " é maior que 15");
		}else {
			System.out.println(total + " é menor ou igual que 15");
		}
		ler.close();
	}

}
