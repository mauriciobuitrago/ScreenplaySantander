package com.co.bootcamp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CalculatorPage {

    public static final Target TXT_FIRST_NUMBER = Target.the("enter the first number")
            .locatedBy("//input[@id='number1Field']");

    public static final Target TXT_SECOND_NUMBER = Target.the("enter the second number")
            .locatedBy("//input[@id='number2Field']");

    public static final Target SELECT_FROM_OPERATION = Target.the("select from option operation")
            .locatedBy("//select[@id='selectOperationDropdown']");

    public static final Target BTN_CALCULATE = Target.the("click button calculate")
            .locatedBy("//input[@id='calculateButton']");

    public static final Target TXT_RESULT = Target.the("obtain the result")
            .locatedBy("//input[@name='numberAnswer']");


}
