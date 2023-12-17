package com.demoqa.interactions;

import com.demoqa.models.OpcionModel;
import com.demoqa.questions.validacionMensaje;
import com.demoqa.userinterface.MenuElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.junit.Assert.fail;

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

        theActorInTheSpotlight().should(seeThat("El selector contiene el texto correcto",
                validacionMensaje.contieneTexto(opcion))
        );
    }

    public static SelecionRadioButton paraDiligenciarFormulario(OpcionModel opcionModel) {
        return Tasks.instrumented(SelecionRadioButton.class, opcionModel);
    }
}