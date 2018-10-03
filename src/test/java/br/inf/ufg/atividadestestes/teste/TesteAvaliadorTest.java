//Criado a classe para os testes
package br.inf.ufg.atividadestestes.teste;

import br.inf.ufg.atividadestestes.Lance;
import br.inf.ufg.atividadestestes.Leilao;
import br.inf.ufg.atividadestestes.Usuario;
import br.inf.ufg.atividadestestes.servico.Avaliador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author João Pedro Salgado
 */
public class TesteAvaliadorTest {
    
    public TesteAvaliadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Realiza o Teste da classe Main
     */
    @Test
    public void testMain() {
        System.out.println("main");
        TesteAvaliador instance = new TesteAvaliador();
        instance.main();
        Usuario joao = new Usuario("João");
        Usuario pedro = new Usuario("Pedro");
        Usuario jose = new Usuario("Jose");

        Leilao leilao = new Leilao("Ferrari");

        leilao.propoe(new Lance(joao, 250.0));
        leilao.propoe(new Lance(pedro, 300.0));
        leilao.propoe(new Lance(jose, 400.0));

        //Parte 2: Todo a Ação do Codigo;
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        double maiorEsperado = 400;
        double menorEsperado = 250;

        //Parte 3: Validacao do Codigo;

        Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.0001);
        Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.0001);
    }
    
}
