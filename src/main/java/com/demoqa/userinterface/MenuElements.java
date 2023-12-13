package com.demoqa.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuElements {
    public static final Target BTN_ELEMENTS =
            Target.the("Boton para dar clic en la opcion elements")
                    .located(By.xpath("//h5[text()='Elements']"));

    public static final Target BTN_RADIO_BUTTON =
            Target.the("Boton para dar clic en la opcio radio button")
                    .locatedBy("//span[text()='Radio Button']");
    }