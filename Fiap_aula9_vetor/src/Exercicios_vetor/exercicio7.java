package Exercicios_vetor;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class exercicio7 {
/*▪ Escreva um algoritmo que recebe uma lista de nomes e imprime os nomes na ordem
inversa a da leitura.
▪ A lista termina quando o usuário aperta o Enter sem que nenhum nome tenha sido
digitado.*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();

        System.out.println("Digite nomes (pressione Enter sem digitar nada para terminar):");

        while (true) {
            String nome = ler.nextLine();
            if (nome.isEmpty()) {
                break;  // Sai do loop se a entrada for uma linha em branco
            }
            nomes.add(nome);  // Adiciona o nome à lista
        }
        
        // Inverte a ordem dos nomes
        Collections.reverse(nomes);
        
        // Imprime os nomes na ordem inversa
        System.out.println("Nomes na ordem inversa:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
	}

}
