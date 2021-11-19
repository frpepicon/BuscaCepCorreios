package pages;

import org.openqa.selenium.WebDriver;

public class paginaBase {
    protected WebDriver navegador;

    public paginaBase(WebDriver navegador){
        this.navegador = navegador;
    }
}