package com.co.bootcamp.tasks;

import com.co.bootcamp.userinterfaces.CalculatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Calculator implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("7").into(CalculatorPage.TXT_FIRST_NUMBER),
                Enter.theValue("5").into(CalculatorPage.TXT_SECOND_NUMBER),
                SelectFromOptions.byValue("1").from(CalculatorPage.SELECT_FROM_OPERATION),
                Click.on(CalculatorPage.BTN_CALCULATE));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static Calculator calculate() {
        return Tasks.instrumented(Calculator.class);
    }
}
