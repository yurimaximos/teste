
public class estruturaDeDecisaoQualMaiorNumero {

	public static void main(String[] args) {
		int valor1 = 255;
		int valor2 = 166;
		int valor3 = 77;
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("O valor1 � maior" + valor1);
		}else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("O valor2 � o maior" + valor2);
		}else{
			System.out.println("O valor3 � o maior" + valor3);
		}
	}

}
