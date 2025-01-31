package br.com.stpaes.Collecton.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
