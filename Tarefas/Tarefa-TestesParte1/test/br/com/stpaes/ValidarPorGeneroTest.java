package br.com.stpaes;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ValidarPorGeneroTest {

    @Test
    public void testApenasMulheres(){
        List<Pessoa> lista = Arrays.asList(
                new Pessoa("Stefanie", "Feminino"),
                new Pessoa("Alexandre", "Masculino"),
                new Pessoa("Jessy", "Masculino"),
                new Pessoa("Tania", "Feminino")
        );

        List<Pessoa> resultado = ValidarPorGenero.validarPorGenero(lista);
        for(Pessoa p: resultado){
            assertEquals("Feminino", p.getSexo());
        }
        assertEquals(2, resultado.size());
    }
}

