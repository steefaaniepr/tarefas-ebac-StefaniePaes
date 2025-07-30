package br.com.stpaes;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste2 {

        @Test
        public void segundoTest(){
            String nome = "Rodrigo";
            Assert.assertEquals("Rodrigo", nome );
        }

        @Test
        public void testNotEquals(){
            String nome = "Stefanie";
            Assert.assertNotEquals("Stefanie1", nome );
        }


}
