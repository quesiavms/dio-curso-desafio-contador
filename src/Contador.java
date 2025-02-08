import java.util.*;

public class Contador 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = scanner.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = scanner.nextInt();
		scanner.close();

		try
		{
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception)
		{
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
				
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException 
	{
		if(parametroUm > parametroDois)
		{
			throw new ParametrosInvalidosException();
		}
		int contagem = parametroDois - parametroUm;

		for (int i=0; i < contagem; i++)
		{
			System.out.println("Imprimindo o numero "+(i +1)); // somando um pra começar no 1
		}

	}
}

//criando a classe de exception
class ParametrosInvalidosException extends Exception 
{

	
}