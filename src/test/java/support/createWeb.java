package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class createWeb {
    public static WebDriver createChrome(){
        //Abrindo Navegador
        System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Navegando para a página dos Correios
        navegador.get("https://www.correios.com.br/");
        return navegador;
    }
}