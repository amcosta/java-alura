
public class Fatorial {
	public static void main (String[] args) {
		int numero = 6;
		int resultado = 1;
		
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		
		System.out.println("O resultado é: " + resultado);
	}
}
