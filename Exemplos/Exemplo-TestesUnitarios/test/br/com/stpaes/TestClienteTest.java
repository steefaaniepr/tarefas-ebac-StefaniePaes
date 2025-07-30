package br.com.stpaes;

import org.junit.Assert;
import org.junit.Test;

public class TestClienteTest {

    @Test
    public void testClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Rodrigo");

        Assert.assertEquals("Rodrigo", cli.getNome());
    }
}

