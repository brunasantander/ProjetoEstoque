package Test;

import Controle.AcertoControle;
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

import java.util.Date;

@RunWith(JUnitParamsRunner.class)

public class TesteGravar {

    private static Produto produto;

    public TesteGravar() {
    }

    @BeforeClass
    public static void setUpClass() {
        produto = new Produto(1L, "Arroz", 10);
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
    @FileParameters("src/main/resources/Test2.csv")
    public void gravar(Long id, int total, char tipo, String motivo, boolean resultado) {
        Assert.assertEquals(resultado, AcertoControle.gravar(id, total, tipo, motivo,produto));
    }
}
