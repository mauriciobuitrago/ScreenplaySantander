package com.co.bootcamp.tasks;

import com.co.bootcamp.userinterfaces.NumberGamePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class NumberGame implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NumberGamePage.BTN_NUMBER_GAME));
        actor.attemptsTo(Click.on(NumberGamePage.BTN_THE_GAME));
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        actor.attemptsTo(SelectFromOptions.byValue("3").from(NumberGamePage.SELECT_NUMBER_DICES));
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        actor.attemptsTo(Click.on(NumberGamePage.BTN_ROLL_DICES));
        try {Thread.sleep(4000);} catch (InterruptedException e) {e.printStackTrace();}
    }


    public static NumberGame throwDice()
    {
        return Tasks.instrumented(NumberGame.class);
    }


}
