package Exercicios_vetor;

import java.util.Scanner;

public class exercicio8 {
/*▪ Escreva um algoritmo que lê um número inteiro n > 0 e preenche um vetor de
caracteres de n posições.
▪ Depois de preencher o vetor, você deverá inverter o seu conteúdo, ou seja, trocar o
conteúdo da primeira posição (0) com a  ́ultima (n − 1) a segunda com a penúltima e
assim por diante até que o vetor esteja invertido.*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// Recebe o número inteiro n
        System.out.print("Digite o número de caracteres (n): ");
        int n = ler.nextInt();
        ler.nextLine();  // Consumir a nova linha deixada pelo nextInt()

        // Verifica se n é maior que 0
        if (n <= 0) {
            System.out.println("O número deve ser maior que 0.");
            return;
        }

        // Cria um vetor de caracteres com tamanho n
        char[] vetor = new char[n];

        // Lê os n caracteres e armazena no vetor
        System.out.println("Digite " + n + " caracteres:");
        for (int i = 0; i < n; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");
            vetor[i] = ler.nextLine().charAt(0);  // Lê um caractere
        }

        // Inverte o vetor
        for (int i = 0; i < n / 2; i++) {
            // Troca o conteúdo da posição i com a posição n - 1 - i
            char temp = vetor[i];
            vetor[i] = vetor[n - 1 - i];
            vetor[n - 1 - i] = temp;
        }

        // Exibe o vetor invertido
        System.out.println("Vetor invertido:");
        for (char c : vetor) {
            System.out.print(c + " ");
        }
	}

}
