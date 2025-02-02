package br.com.stpaes.Collecton.Array.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        atendendoChamados();
        historicoNavegacao();
        filaAtendimento();
    }

    private static void filaAtendimento() {
        List<String> fila = new LinkedList<>();

        fila.add("Cliente 1");
        fila.add("Cliente 2");
        fila.add("Cliente 3");

        System.out.println("---Fila de atendimento---");
        System.out.println(fila);

        while (!fila.isEmpty()) {
            System.out.println("\nAtendendo: " + fila.remove(0));
            System.out.println("Fila atual: " + fila);
        }
    }

    private static void historicoNavegacao() {
        LinkedList<String> historico = new LinkedList<>();

        historico.addFirst("google.com");
        historico.addFirst("github.com");
        historico.addFirst("stackoverflow.com");

        System.out.println("Pagina atual: " + historico.pollFirst());
        System.out.println("Pagina anterior: " + historico.peekLast());
    }

    private static void atendendoChamados() {
        List<Chamado> filaChamados = new LinkedList<>();

        filaChamados.add(new Chamado("Erro no login"));
        filaChamados.add(new Chamado("Erro no senha"));
        filaChamados.add(new Chamado("Sistema fora do ar"));
        filaChamados.add(new Chamado("Problema na impressora"));

        while (!filaChamados.isEmpty()) {
            System.out.println("Atendendo: " + filaChamados.remove(0));
        }
    }
}
// Para um sistema de suporte onde novas solicitações são inseridas no final e processadas na ordem de chegada, LinkedList pode ser mais eficiente.
// LinkedList facilita remoções e inserções frequentes no meio da lista.
// Em navegadores, geralmente usamos um LinkedList para armazenar o histórico, pois é fácil adicionar e remover itens no topo da pilha.
// LinkedList permite acesso rápido ao último item visitado.
