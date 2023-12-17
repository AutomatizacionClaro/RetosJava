package com.demoqa.interactions;

import com.demoqa.models.OpcionModel;
import com.demoqa.userinterface.MenuElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelecionRadioButton implements Interaction {

    private final OpcionModel opcionModel;

    public SelecionRadioButton(OpcionModel opcionModel) {
        this.opcionModel = opcionModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String opcion = opcionModel.getOpcion().trim().toUpperCase();
        if (opcion.contains("YES")) {
            actor.attemptsTo(Click.on(MenuElements.BTN_YES));
        }
        if (opcion.contains("IMPRESSIVE")) {
            actor.attemptsTo(Click.on(MenuElements.BTN_IMPRESSIVE));
        }
    }

    public static SelecionRadioButton paraDiligenciarFormulario(OpcionModel opcionModel) {
        return Tasks.instrumented(SelecionRadioButton.class, opcionModel);
    }
}