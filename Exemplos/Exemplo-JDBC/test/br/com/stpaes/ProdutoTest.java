package br.com.stpaes;


import br.com.stpaes.Domain.Produto;
import br.com.stpaes.dao.generic.jdbc.dao.IProdutoDao;
import br.com.stpaes.dao.generic.jdbc.dao.ProdutoDao;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    @Test
    public void cadastrarTest() throws Exception{
        produtoDao = new ProdutoDao();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Caneta");
        Integer countCad = produtoDao.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoDB = produtoDao.buscar("10");
        assertNotNull(produtoDB);
        assertEquals(produto.getCodigo(), produtoDB.getCodigo());
        assertEquals(produto.getNome(), produtoDB.getNome());

        Integer countDel = produtoDao.excluir(produtoDB);
        assertTrue(countDel == 1);
    }

    @Test
    public void buscarTest() throws Exception{
        produtoDao = new ProdutoDao();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Caneta");
        Integer countCad = produtoDao.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoDB = produtoDao.buscar("10");
        assertNotNull(produtoDB);
        assertEquals(produto.getCodigo(), produtoDB.getCodigo());
        assertEquals(produto.getNome(), produtoDB.getNome());

        Integer countDel = produtoDao.excluir(produtoDB);
        assertTrue(countDel == 1);
    }

    @Test
    public void excluirTest() throws Exception{
        produtoDao = new ProdutoDao();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Caneta");
        Integer countCad = produtoDao.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoDB = produtoDao.buscar("10");
        assertNotNull(produtoDB);
        assertEquals(produto.getCodigo(), produtoDB.getCodigo());
        assertEquals(produto.getNome(), produtoDB.getNome());

        Integer countDel = produtoDao.excluir(produtoDB);
        assertTrue(countDel == 1);
    }

    @Test
    public void buscarTodosTest() throws Exception {
        produtoDao = new ProdutoDao();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Caneta");
        Integer countCad = produtoDao.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtos = new  Produto();
        produtos.setCodigo("20");
        produtos.setNome("Teste");
        Integer countCad2 = produtoDao.cadastrar(produtos);
        assertTrue(countCad2 == 1);

        List<Produto> list = produtoDao.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());

        int countDel = 0;
        for (Produto p : list) {
            produtoDao.excluir(p);
            countDel++;
        }
        assertEquals(list.size(), countDel);
        list = produtoDao.buscarTodos();
        assertEquals(list.size(), 0);
    }

    @Test
    public void atualizarTest() throws Exception {
        produtoDao = new ProdutoDao();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Rodrigo Pires");
        Integer countCad = produtoDao.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoDB = produtoDao.buscar("10");
        assertNotNull(produtoDB);
        assertEquals(produto.getCodigo(), produtoDB.getCodigo());
        assertEquals(produto.getNome(), produtoDB.getNome());

        produtoDB.setCodigo("20");
        produtoDB.setNome("Outro nome");
        Integer countUpdate = produtoDao.atualizar(produtoDB);
        assertTrue(countUpdate == 1);

        Produto produtoDB1 = produtoDao.buscar("10");
        assertNull(produtoDB1);

        Produto produtoBD2 = produtoDao.buscar("20");
        assertNotNull(produtoBD2);
        assertEquals(produtoDB.getId(), produtoBD2.getId());
        assertEquals(produtoDB.getCodigo(), produtoBD2.getCodigo());
        assertEquals(produtoDB.getNome(), produtoBD2.getNome());

        List<Produto> list = produtoDao.buscarTodos();
        for  (Produto p : list) {
            produtoDao.excluir(p);
        }
    }
}
