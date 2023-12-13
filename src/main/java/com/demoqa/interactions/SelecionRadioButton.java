package com.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class SelecionRadioButton implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        String opcion = "";
        System.out.println(opcion);

    }

    public static SelecionRadioButton paraDiligenciarFormulario(String opcion) {
        return Tasks.instrumented(SelecionRadioButton.class, opcion);
    }
}