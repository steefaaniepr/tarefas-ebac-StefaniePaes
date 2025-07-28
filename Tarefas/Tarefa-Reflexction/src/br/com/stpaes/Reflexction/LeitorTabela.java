package br.com.stpaes.Reflexction;

public class LeitorTabela {

    public static void main(String[] args) {

        Class<?>[] classe = {Cliente.class, Produto.class};

        for (Class<?> c : classe) {
            if( c.isAnnotationPresent(Tabela.class)) {
                Tabela tabela = c.getAnnotation(Tabela.class);
                System.out.println("Classe: " + c.getSimpleName() + " -> Tabela: " + tabela.value());
            } else {
                System.out.println("A classe " + c.getSimpleName() + "Não possui a anotação @Tabela");
            }
        }
    }
}
