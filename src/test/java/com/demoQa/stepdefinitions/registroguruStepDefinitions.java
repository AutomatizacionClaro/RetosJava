package com.demoQa.stepdefinitions;

import com.demoqa.models.GuruModel;
import com.demoqa.tasks.CargarPaginaGuru;
import com.demoqa.tasks.CompletarRegisterGuru;
import com.demoqa.userinterface.MenuRegisterGuru;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class registroguruStepDefinitions {
    private final GuruModel guruModel = GuruModel.getInstancia();

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(("actor"));
    }

    @Dado("que ingreso en la pagina")
    public void Url() {
        theActorInTheSpotlight().wasAbleTo(CargarPaginaGuru.paraRegistro());
    }

    @Y("accedo a la opcion register")
    public void accedoALaOpcionRegister() {
        theActorInTheSpotlight().attemptsTo(Click.on(MenuRegisterGuru.BTN_REGISTER));

    }

    @Entonces("diligencio el formulario")
    public void diligencioElFormulario(DataTable dataTable) {
        guruModel.setIngresarDatos(dataTable.asLists().get(0));
        theActorInTheSpotlight().wasAbleTo(CompletarRegisterGuru.paraUnNuevoUsuario(guruModel));
    }
}