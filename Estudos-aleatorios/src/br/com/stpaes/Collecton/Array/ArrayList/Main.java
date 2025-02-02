package br.com.stpaes.Collecton.Array.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        adicionandoProdutos();
        listaAlunos();
        gerenciandoFuncionario();
    }

    private static void gerenciandoFuncionario() {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Mateus", "Analista"));
        funcionarios.add(new Funcionario("Luciana", "Gerente"));
        funcionarios.add(new Funcionario("Stefanie", "Desenvolvedor"));


        System.out.println("---Funcionários cadastrados---");
        funcionarios.forEach(System.out::println);

        funcionarios.removeIf(funcionario -> funcionario.nome.equals("Luciana"));

        System.out.println("\nApós a remoção de Luciana: ");
        funcionarios.forEach(System.out::println); //Código que mostra os funcionarios da lista.

    }

    private static void listaAlunos() {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Stefanie",28));
        alunos.add(new Aluno("Tania", 56));
        alunos.add(new Aluno("Alexandre", 60));

        alunos.sort(Comparator.comparing(a -> a.nome));

        System.out.println("---Alunos Ordenados ---");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    private static void adicionandoProdutos() {
        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Notebook", 4500.00));
        produtos.add(new Produto("Mouse", 150.00));
        produtos.add(new Produto("Teclado", 250.00));

        System.out.println("---Lista de produtos---");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
