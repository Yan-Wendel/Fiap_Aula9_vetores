package Exercicios_vetor;
import java.util.Scanner;

public class exercicio6 {
/*▪ Escreva um algoritmo que lê um número inteiro n, cria um vetor de inteiros de
tamanho n, faz a leitura de um conjunto de n números inteiros armazenando-os no
vetor e depois calcula a somatória dos números contidos no vetor.
▪ Dica: note que a somatória deverá ser feita após o vetor estar preenchido.*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// Recebe o número inteiro n
        System.out.print("Digite um número inteiro positivo: ");
        int n = ler.nextInt();
        int soma = 0;
        int []numero = new int [n];
        for(int i = 0;i<n;i++) {
        	System.out.print("Digite um valor "+(i + 1)+ " agora: ");
        	numero[i]=ler.nextInt();
        	soma+=numero[i];
        }
        System.out.print("A somatiria: "+soma);
	}

}
