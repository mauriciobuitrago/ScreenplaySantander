package com.co.bootcamp.questions;

import com.co.bootcamp.userinterfaces.CalculatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CaptureResult implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(CalculatorPage.TXT_RESULT).viewedBy(actor).asString();
    }

    public static CaptureResult validate()
    {
        return new CaptureResult();
    }
}
