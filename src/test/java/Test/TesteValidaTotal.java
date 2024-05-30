package Test;

import Entidade.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)

public class TesteValidaTotal {

    private static Produto produto1;

    public TesteValidaTotal() {
    }

    @BeforeClass
    public static void setUpClass() {
        produto1 = new Produto(1L, "Arroz", 10);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    @FileParameters("src/main/resources/Test.csv")
    public void ValidarTotal(char tipo, int produtoId, int quantidade, boolean resultado) {
        Assert.assertEquals(resultado, Produto.validaTotal(quantidade, tipo, produto1.getQuantidade()));
    }
}
