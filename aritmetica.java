import java.util.Scanner;

public class aritmetica {
	public static void main(String[] args) {
		
		int n1; //primeiro número solicitado
		int n2; //segundo número solicitado
		int soma; // soma dos números
		int diferenca;
		int produto;
		int divisao;
		
		//Pedir 2 números para o usuário
		Scanner entrada = new Scanner(System.in); // Cria um objeto de scanner que lê da ebtrada padrão (System.in);
		
		//Carregar esses números como inteiros
		System.out.print("Insira o 1º número: ");
		n1 = entrada.nextInt();
		
		System.out.print("Insira o 2º número: ");
		n2 = entrada.nextInt();
			
		entrada.close();
		
		// Operações dos dois números
		soma = n1+n2;
		diferenca = n1-n2;
		produto = n1*n2;
		divisao = n1/n2;
		// Imprimir a soma
		System.out.printf("Soma: %d\n",soma);
		System.out.printf("Diferença: %d\n",diferenca);
		System.out.printf("Produto: %d\n",produto);
		System.out.printf("Divisao: %d\n",divisao);
		
		if (n1==n2){
			System.out.println("Os números são iguais");
		} else if (n1>n2){
			System.out.printf("O maior é: %d\n", n1);
		}else{
			System.out.printf("O maior é: %d\n", n2);
		}
		
		// n1 é múltiplo de n2?
		if(n1 % n2 == 0){
			System.out.println("n1 é múltiplo de n2");
		}else {
			System.out.println("nq não é múltiplo de n2");
		}
	}
}