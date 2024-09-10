package Exercicios_vetor;

public class exercicio5 {
/*▪ Faça um programa que tenha 2 vetores. Um vetor para os meses e outros para a
quantidade de dias para cada mês.

▪ Seu programa deve exibir mensagens da seguinte forma:
▪ O Mês de Jan tem 31 dias ao todo.
▪ O mês de Fev tem 28 dias ao todo.
▪ O mês de Mar tem 31 dias ao todo.
▪ ...
▪ O mês de Dez tem 31 dias ao todo.*/
	public static void main(String[] args) {
		//vetor com os meses.
		String[] meses = {
				"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"
		};
		int []dias= {
				31,28,31,30,31,30,31,31,30,31,30,31
		};
		// Exibe a quantidade de dias para cada mês
        for (int i = 0; i < meses.length; i++) {
            System.out.println("O mês de " + meses[i] + " tem " + dias[i] + " dias ao todo.");
        }
	}

}
