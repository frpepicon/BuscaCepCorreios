package pages;

import com.beust.jcommander.internal.Lists;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class correiosMain extends paginaBase {

    public correiosMain(WebDriver navegador) {
        super(navegador);
    }

    //Preencher a informação no campo de busca de Endereço/CEP
    public correiosMain digitarDado(String dado) {
        System.out.print("Informação inserida para Busca: " + dado + "\n\n");
        navegador.findElement(By.id("relaxation")).sendKeys(dado);
        return this;
    }

    //Submeter o formulário de Busca de CEP
    public correiosMain clicarBuscar() {
        navegador.findElement(By.id("relaxation")).submit();
        return this;
    }

    //Início exportar a tabela e printar no console
    public correiosMain exportarTabela() {
        //Listar quantas abas existem abertas no navegador
        List<String> browserTabs = Lists.newArrayList(navegador.getWindowHandles());
        //Alternar o foco para a segunda aba do navegador
        navegador.switchTo().window(browserTabs.get(1));

        //Montar estrutura das informações que serão impressas no console
        WebElement tabelaResultados = navegador.findElement(By.xpath("//table[@id='resultado-DNEC']/tbody"));
        List<WebElement> linhas = tabelaResultados.findElements(By.tagName("tr"));
        for (WebElement linha : linhas) {
            List<WebElement> colunas = linha.findElements(By.tagName("td"));
            for (WebElement coluna : colunas) {
                System.out.println(coluna.getText() + "\t");
            } System.out.println();
        }
        return this;
    }
}