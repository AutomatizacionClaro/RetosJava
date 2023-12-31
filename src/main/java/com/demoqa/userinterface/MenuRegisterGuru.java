package com.demoqa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuRegisterGuru {

    public static final Target BTN_REGISTER =
            Target.the("Boton para dar clic en la opcion register")
                    .located(By.xpath("//a[text()='REGISTER']"));

    public static final Target INPUT_FIRST_NAME =
            Target.the("Input para completar campo first name")
                    .located(By.xpath("//input[@name='firstName']"));

    public static final Target INPUT_LAST_NAME =
            Target.the("Input para completar campo last name")
                    .located(By.xpath("//input[@name='lastName']"));

    public static final Target INPUT_PHONE =
            Target.the("Input para completar campo phone")
                    .located(By.xpath("//b[text()='Phone:']/following::input[1]"));

    public static final Target INPUT_EMAIL =
            Target.the("Input para completar campo email")
                    .located(By.xpath("//input[@id='userName']"));

    public static final Target INPUT_ADDRESS =
            Target.the("Input para completar campo address")
                    .located(By.xpath("//input[@name='address1']"));

    public static final Target INPUT_CITY =
            Target.the("Input para completar campo city")
                    .located(By.xpath("//input[@name='city']"));

    public static final Target INPUT_STATE_PROVINCE =
            Target.the("Input para completar campo state province")
                    .located(By.xpath("//input[@name='state']"));

    public static final Target INPUT_POSTAL_CODE =
            Target.the("Input para completar campo postal code")
                    .located(By.xpath("//input[@name='postalCode']"));

    public static final Target SELECT_COUNTRY =
            Target.the("Select para elegir el pais")
                    .locatedBy("//option[contains(@value,'{0}')]");


    public static final Target INPUT_USER_NAME =
            Target.the("Input para selecionar la opcion user name")
                    .located(By.xpath("//input[@id='email']"));

    public static final Target INPUT_PASSWORD =
            Target.the("Input para selecionar la opcion password")
                    .located(By.xpath("//input[@name='password']"));

    public static final Target INPUT_CONFIRM_PASSWORD =
            Target.the("Input para selecionar la opcion confirm password")
                    .located(By.xpath("//input[@name='confirmPassword']"));

    public static final Target INPUT_ENVIAR =
            Target.the("Input para dar clic en enviar")
                    .located(By.xpath("//input[@name='submit']"));
}