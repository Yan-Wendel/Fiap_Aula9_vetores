package Exercicios_vetor;

public class exercicio10 {

	public static void main(String[] args) {
		 final int LINHAS = 3;
	        final int COLUNAS = 4;
	        
	        // Cria e inicializa as matrizes A e B
	        int[][] matrizA = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12}
	        };
	        
	        int[][] matrizB = {
	            {12, 11, 10, 9},
	            {8, 7, 6, 5},
	            {4, 3, 2, 1}
	        };
	        
	        // Cria a matriz para armazenar o resultado da soma
	        int[][] matrizC = new int[LINHAS][COLUNAS];
	        
	        // Realiza a soma das matrizes A e B
	        for (int i = 0; i < LINHAS; i++) {
	            for (int j = 0; j < COLUNAS; j++) {
	                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
	            }
	        }
	        
	        // Exibe as matrizes A, B e C
	        System.out.println("Matriz A:");
	        exibirMatriz(matrizA);
	        
	        System.out.println("Matriz B:");
	        exibirMatriz(matrizB);
	        
	        System.out.println("Matriz C (A + B):");
	        exibirMatriz(matrizC);
	    }
	    
	    // Método para exibir uma matriz
	    public static void exibirMatriz(int[][] matriz) {
	        for (int[] linha : matriz) {
	            for (int elemento : linha) {
	                System.out.printf("%4d", elemento);
	            }
	            System.out.println();
	        }

	}

}
