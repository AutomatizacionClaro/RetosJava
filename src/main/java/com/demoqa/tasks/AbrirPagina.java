package com.demoqa.tasks;

import com.demoqa.userinterface.MenuElements;
import com.demoqa.userinterface.UrlPaginaInicial;
import com.demoqa.utils.WebUtils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AbrirPagina implements Task {

    private UrlPaginaInicial urlPaginaInicial;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(Open.browserOn(urlPaginaInicial));
        actor.usingAbilityTo(BrowseTheWeb.class).getDriver().manage().window().maximize();
        WebUtils.scroll(0, 300);
        theActorInTheSpotlight().attemptsTo(Click.on(MenuElements.BTN_ELEMENTS));
    }

    public static AbrirPagina enElNavegador() {
        return Tasks.instrumented(AbrirPagina.class);
    }
}