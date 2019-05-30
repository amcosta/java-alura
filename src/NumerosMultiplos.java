
public class NumerosMultiplos 
{
	public static void main (String[] args)
	{
		int multiplicador = 3;
		int quantidadeNumeros = 100;
		
		for (int cont = 1; cont <= quantidadeNumeros; cont++) {
			if ((cont % multiplicador) == 0) {
				System.out.println(cont);
			}
		}
	}
}
