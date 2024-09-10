package Exercicios_vetor;
import java.util.Scanner;
public class exercicio4 {
/*▪ Considere uma turma de n alunos onde desejamos calcular a média das notas da
prova semestral e saber quantas notas estão iguais, acima e abaixo dessa média.
▪ Escreva um algoritmo que lê um inteiro n representando a quantidade de alunos e
cada uma das n notas e mostra a média da turma, quantas notas são iguais, acima e
abaixo da média da turma.*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// Recebe o número inteiro n
        System.out.print("Digite um número inteiro positivo: ");
        int n = ler.nextInt();
        double notas[] = new double[n];
        //ler as notas
        System.out.print("Digite a nota: ");
        double soma=0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = ler.nextDouble();
            soma += notas[i];
        }
     // Calcula a média
        double media = soma / n;
        System.out.println("Média da turma: " + media);
        // Conta as notas em relação à média
        int iguais = 0, acima = 0, abaixo = 0;
        for (double nota : notas) {
            if (nota == media) {
                iguais++;
            } else if (nota > media) {
                acima++;
            } else {
                abaixo++;
            }
        }
        // Exibe o resultado
        System.out.println("Notas iguais à média: " + iguais);
        System.out.println("Notas acima da média: " + acima);
        System.out.println("Notas abaixo da média: " + abaixo);
	}

}
