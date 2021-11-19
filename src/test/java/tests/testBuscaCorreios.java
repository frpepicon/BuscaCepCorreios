package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.correiosMain;
import support.createWeb;


public class testBuscaCorreios {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = createWeb.createChrome();
    }

    @Test
    public void testBuscarLogradouro(){
        new correiosMain(navegador)
                .digitarDado("Rua Real Grandeza RJ")
                .clicarBuscar()
                .exportarTabela();
    }

    @Test
    public void testBuscarCep(){
        new correiosMain(navegador)
                .digitarDado("22281-034")
                .clicarBuscar()
                .exportarTabela();
    }

    @After
    public void quitBrowser(){
        navegador.quit();
    }
}
