package stepdefinitions;

import com.demoqa.interactions.SelecionRadioButton;
import com.demoqa.tasks.AbrirPagina;
import com.demoqa.tasks.SeleccionarElemento;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MenuElementosStepDefinition {

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(("actor"));
    }

    @Dado("que envio la url doy clic a la opcion elements")
    public void envioLaUrlDoyClicALaOpcionElements() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.enElNavegador());
    }

    @Y("le doy clic a la opcion radio button")
    public void leDoyClicALaOpcionRadioButton() {
        theActorInTheSpotlight().wasAbleTo(SeleccionarElemento.enElMenu());
    }

    @Y("^selecciono la opcion requerida (.*)$")
    public void seleccionoLaOpcionRequerida(String opcion) {
        theActorInTheSpotlight().wasAbleTo(SelecionRadioButton.paraDiligenciarFormulario(opcion));
    }
}