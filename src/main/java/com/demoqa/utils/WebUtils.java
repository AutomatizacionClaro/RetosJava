package com.demoqa.utils;

import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.core.Serenity.getDriver;

public class WebUtils {


    /**
     * Este metodo realiza scrolls de manera parametrizada por medio de parametros, estos parametros definen el numero de pixeles que sube o baja la pantalla
     *
     * @param x Recibe parametro de pixeles para moverse en el sentido lateral por medio del eje X
     * @param y Recibe parametro de pixeles para moverse en el sentido lateral por medio del eje Y
     */
    public static void scroll(int x, int y) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        String script = String.format("window.scrollTo(%d, %d);", x, y);
        jsExecutor.executeScript(script);
    }
}