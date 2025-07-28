package br.com.stpaes.Collecton.Map.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        transformandoLista();
    }

    private static void transformandoLista() {
        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto(1, "Celular", 2500.00));
        produtos.add(new Produto(2, "Notebook", 5000.00));
        produtos.add(new Produto(3, "Fone de ouvido", 300.00));

        Map<Integer, Produto> produtoMap = new HashMap<Integer, Produto>();
        for (Produto p : produtos) {
            produtoMap.put(p.id, p);
        }

        System.out.println("Produto com ID 2: " + produtoMap.get(2));

        //Convertamos a lista para um Map<Integer, Produto> para busca eficiente por ID.
        //Evitamos a necessidade de percorrer toda a lista para encontrar um item.

    }
}
