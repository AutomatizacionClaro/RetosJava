package com.demoqa.tasks;

import com.demoqa.models.GuruModel;
import com.demoqa.userinterface.MenuRegisterGuru;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompletarRegisterGuru implements Task {

    private final GuruModel guruModel;

    public CompletarRegisterGuru(GuruModel guruModel) {
        this.guruModel = guruModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(guruModel.getNombre()).into(MenuRegisterGuru.INPUT_FIRST_NAME));
        actor.attemptsTo(Enter.theValue(guruModel.getApellido()).into(MenuRegisterGuru.INPUT_LAST_NAME));
        actor.attemptsTo(Enter.theValue(guruModel.getTelefono()).into(MenuRegisterGuru.INPUT_PHONE));
        actor.attemptsTo(Enter.theValue(guruModel.getCorreo()).into(MenuRegisterGuru.INPUT_EMAIL));
        actor.attemptsTo(Enter.theValue(guruModel.getDireccion()).into(MenuRegisterGuru.INPUT_ADDRESS));
        actor.attemptsTo(Enter.theValue(guruModel.getCiudad()).into(MenuRegisterGuru.INPUT_CITY));
        actor.attemptsTo(Enter.theValue(guruModel.getProvincia()).into(MenuRegisterGuru.INPUT_STATE_PROVINCE));
        actor.attemptsTo(Enter.theValue(guruModel.getCodigoPostal()).into(MenuRegisterGuru.INPUT_POSTAL_CODE));
        actor.attemptsTo(Enter.theValue(guruModel.getCodigoPostal()).into(MenuRegisterGuru.INPUT_POSTAL_CODE));
        actor.attemptsTo(Click.on(MenuRegisterGuru.SELECT_COUNTRY.of(guruModel.getPais().toUpperCase())));
        actor.attemptsTo(Enter.theValue(guruModel.getUsuario()).into(MenuRegisterGuru.INPUT_USER_NAME));
        actor.attemptsTo(Enter.theValue(guruModel.getContrasena()).into(MenuRegisterGuru.INPUT_PASSWORD));
        actor.attemptsTo(Enter.theValue(guruModel.getContrasena()).into(MenuRegisterGuru.INPUT_CONFIRM_PASSWORD));
        actor.attemptsTo(Click.on(MenuRegisterGuru.INPUT_ENVIAR));
    }

    public static CompletarRegisterGuru paraUnNuevoUsuario(GuruModel guruModel) {
        return Tasks.instrumented(CompletarRegisterGuru.class, guruModel);
    }
}