package br.com.stpaes.testes;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void primeiroTest(){
        String nome = "Stefanie";
        Assert.assertEquals("Stefanie", nome );
    }

    @Test
    public void testNotEquals(){
        String nome = "Stefanie";
        Assert.assertNotEquals("Stefanie1", nome );
    }

}