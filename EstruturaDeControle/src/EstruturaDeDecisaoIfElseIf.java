import java.util.Scanner;

public class EstruturaDeDecisaoIfElseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o mes");
		int mesDoAno = sc.nextInt(); 
		
		if (mesDoAno == 12 || mesDoAno ==1 || mesDoAno == 2) {
			System.out.println("Ver�o");
		} else if (mesDoAno == 3 || mesDoAno == 4 || mesDoAno == 5) {
			System.out.println("Outono");
		} else if (mesDoAno == 6 || mesDoAno == 7 || mesDoAno == 8) {
			System.out.println("Inverno");
		} else if (mesDoAno == 9 || mesDoAno == 10 || mesDoAno == 11) {
			System.out.println("Primavera");
		}
	}
}
