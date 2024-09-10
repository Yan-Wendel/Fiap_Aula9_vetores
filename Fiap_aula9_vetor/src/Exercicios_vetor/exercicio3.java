package Exercicios_vetor;
import java.util.Scanner;
import java.util.Random;
public class exercicio3 {
	/*▪ Escreva um algoritmo que recebe um número inteiro n > 0, cria um vetor de números
	reais com n posições e preenche o vetor com n números aleatórios reais.
	▪ Depois de preenchido o vetor, imprima na tela todos os números gerados.*/
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
	        Random random = new Random();
	        
	        // Recebe o número inteiro n
	        System.out.print("Digite um número inteiro positivo n: ");
	        int n = ler.nextInt();
	        
	        // Verifica se n é maior que 0
	        if (n <= 0) {
	            System.out.println("O número deve ser maior que 0.");
	            return;
	        }
	        
	        // Cria um vetor de números reais com n posições
	        double[] vetor = new double[n];
	        
	        // Preenche o vetor com n números aleatórios reais
	        for (int i = 0; i < n; i++) {
	            vetor[i] = random.nextDouble() * 100; // Gera números aleatórios reais entre 0.0 e 100.0
	        }
	        
	        // Imprime os números gerados
	        System.out.println("Números gerados:");
	        for (double num : vetor) {
	            System.out.println(num);
	        }

	}

}
