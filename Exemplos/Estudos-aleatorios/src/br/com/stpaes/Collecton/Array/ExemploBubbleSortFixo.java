package br.com.stpaes.Collecton.Array;

import java.util.Arrays;

public class ExemploBubbleSortFixo {

    public static void main(String[] args) {
        int[] vet = {8, 9, 3, 5, 1};
        int aux =0;
        int i = 0;

        System.out.println("---Vetor desordenado---");
        for (i = 0; i < vet.length; i++) {
            System.out.println(" " + vet[i]);
        }
        //O código inicia declarando um vetor de inteiros chamado vet contendo {8, 9, 3, 5, 1}.
        //
        //Depois, ele imprime os elementos do vetor sem ordenação:

        System.out.println(" ");

        //Agora, o código começa a ordenar os números em ordem crescente usando o Bubble Sort.
        for (i = 0; i < vet.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        //O laço externo (for (i = 0; i < vet.length; i++)) garante que todas as comparações necessárias sejam feitas.
        //O laço interno (for (int j = 0; j < 4; j++)) percorre o vetor e compara dois números vizinhos.
        //Se vet[j] for maior que vet[j + 1], troca de posição usando a variável auxiliar aux.

        System.out.println("---Vetor organizado--- ");
        for (i = 0; i < vet.length; i++) {
            System.out.println(" " + vet[i]);
        }

        //Depois de ordenar, o código imprime o vetor:

    }
}
