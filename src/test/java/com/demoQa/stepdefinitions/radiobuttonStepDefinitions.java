package com.demoQa.stepdefinitions;

import com.demoqa.interactions.SelecionRadioButton;
import com.demoqa.models.OpcionModel;
import com.demoqa.tasks.*;
import com.demoqa.userinterface.MenuElements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class radiobuttonStepDefinitions {

    private final OpcionModel opcionModel = OpcionModel.getInstancia();

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(("actor"));
    }

    @Dado("que envio la url")
    public void queEnvioLaUrl() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.enElNavegador());
    }

    @Y("accedo a la opcion elements")
    public void leDoyClicALaOpcionelements() {
        theActorInTheSpotlight().attemptsTo(Click.on(MenuElements.BTN_ELEMENTS));
    }

    @Cuando("le doy clic a la opcion radio button")
    public void leDoyClicALaOpcionRadioButton() {
        theActorInTheSpotlight().wasAbleTo(SeleccionarElemento.enElMenu());
    }

    @Entonces("selecciono la opcion requerida")
    public void seleccionoLaOpcionRequerida(DataTable dataTable) {
        opcionModel.setSeleccionRadiobutton(dataTable.asLists().get(0));
        theActorInTheSpotlight().wasAbleTo(SelecionRadioButton.paraDiligenciarFormulario(opcionModel));


    }


}