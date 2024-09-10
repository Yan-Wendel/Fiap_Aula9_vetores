package Exercicios_vetor;
import java.util.Random;
public class exercicio9 {
/*▪ Crie um programa com uma matriz 3x4
▪ 3 linhas
▪ 4 colunas

▪ Atribua valores aleatórios à todas posições da matriz.
▪ Exiba essa matriz.*/
	public static void main(String[] args) {
		final int LINHAS = 3;
        final int COLUNAS = 4;
        
        // Cria a matriz 3x4
        int[][] matriz = new int[LINHAS][COLUNAS];
        
        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();
        
        // Preenche a matriz com valores aleatórios entre 0 e 99
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                matriz[i][j] = random.nextInt(100); // Gera um número aleatório entre 0 e 99
            }
        }
        
        // Exibe a matriz
        System.out.println("Matriz 3x4 com valores aleatórios:");
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.printf("%4d", matriz[i][j]); // Exibe o valor com uma largura de 4 caracteres
            }
            System.out.println(); // Nova linha após imprimir uma linha da matriz
        }

	}

}
