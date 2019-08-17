import java.util.Scanner;

public class EstruturaDeDecisaoMediaNotas {

	public static void main(String[] args) {
		double nota1 = 10;
		double nota2 = 3.1;
		double nota3 = 10;
		double nota4 = 3.1;
		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 6) {
			System.out.println("Aluno aprovado");
		} else if (media < 6 && media >= 5) {
			System.out.println("recuperação");
		} else {
			System.out.println("Reprovado");
		}
	}

}
