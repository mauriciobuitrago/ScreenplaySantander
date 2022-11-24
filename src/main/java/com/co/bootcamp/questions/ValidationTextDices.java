package com.co.bootcamp.questions;

import com.co.bootcamp.userinterfaces.NumberGamePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationTextDices implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(NumberGamePage.LBL_VALIDATION_ROLL).viewedBy(actor).asString();
    }


    public static ValidationTextDices vadilate()
    {
        return new ValidationTextDices();
    }
}
