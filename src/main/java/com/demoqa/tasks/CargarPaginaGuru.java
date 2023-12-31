package com.demoqa.tasks;

import com.demoqa.userinterface.UrlPaginaGuru;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

public class CargarPaginaGuru implements Task {
    private UrlPaginaGuru urlPaginaGuru;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(Open.browserOn(urlPaginaGuru));
        actor.usingAbilityTo(BrowseTheWeb.class).getDriver().manage().window().maximize();
    }

    public static CargarPaginaGuru paraRegistro() {
        return Tasks.instrumented(CargarPaginaGuru.class);
    }
}