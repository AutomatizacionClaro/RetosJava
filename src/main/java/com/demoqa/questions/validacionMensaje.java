package com.demoqa.questions;

import com.demoqa.models.OpcionModel;
import com.demoqa.userinterface.MenuElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class validacionMensaje implements Question<Boolean> {
    public final String texto;

    public validacionMensaje(String texto) {
        this.texto = texto;
    }

    public static validacionMensaje contieneTexto(String texto) {
        return new validacionMensaje(texto);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // Aquí obtén el texto del selector y verifica si contiene el texto esperado
        String textoEnPantalla = MenuElements.ALERTA_SUCCESS.resolveFor(actor).getText().toUpperCase();
        return textoEnPantalla.contains(texto);

    }
}


