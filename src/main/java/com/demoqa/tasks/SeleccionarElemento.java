package com.demoqa.tasks;

import com.demoqa.userinterface.MenuElements;
import com.demoqa.utils.WebUtils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeleccionarElemento implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        WebUtils.scroll(0, 200);
        theActorInTheSpotlight().attemptsTo(Click.on(MenuElements.BTN_RADIO_BUTTON));
    }

    public static SeleccionarElemento enElMenu() {
        return Tasks.instrumented(SeleccionarElemento.class);
    }
}